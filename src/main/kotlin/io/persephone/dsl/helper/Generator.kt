package io.persephone.dsl.helper

import java.io.File

object Generator {

	@JvmStatic
	fun main(args: Array<String>) {

		// elements from https://developer.mozilla.org/en-US/docs/Web/HTML/Element

		val headElements = arrayOf(
			"head",
			"base:href,target",
			"link:rel,type,href",
			"meta:charset,name,content",
			"style",
			"title"
		)

		val contentSectionElements = arrayOf(
			"address",
			"article",
			"aside",
			"footer",
			"header",
			"h1", "h2", "h3", "h4", "h5", "h6",
			"hgroup",
			"main",
			"nav",
			"section"
		)

		val textContentElements = arrayOf(
			"blockquote",
			"dd",
			"dir",
			"div",
			"dl",
			"dt",
			"figcaption",
			"figure",
			"hr",
			"li",
			"main",
			"ol",
			"p",
			"pre",
			"ul"
		)

		val inlineTextSemanticElements = arrayOf(
			"a:download,href,hreflang,media,ping,referrerpolicy,rel,target,type",
			"abbr",
			"b",
			"bdi",
			"bdo",
			"br",
			"cite",
			"code",
			"data",
			"dfn",
			"em",
			"i",
			"kbd",
			"mark",
			"q",
			"rb",
			"rp",
			"rt",
			"rtc",
			"ruby",
			"s",
			"samp",
			"small",
			"span",
			"strong",
			"sub",
			"sup",
			"time",
			"tt",
			"u",
			"varx",
			"wbr"
		)

		val imageMultimediaElements = arrayOf(
			"area",
			"audio",
			"img",
			"map",
			"track",
			"video"
		)

		val embeddedContent = arrayOf(
			"applet",
			"embed",
			"iframe",
			"noembed",
			"objectx",
			"param",
			"picture",
			"source"
		)

		val scriptingElements = arrayOf(
			"canvas",
			"noscript",
			"script"
		)

		val demarcatingEditElements = arrayOf(
			"del",
			"ins"
		)

		val tableContentElements = arrayOf(
			"caption",
			"col",
			"colgroup",
			"table",
			"tbody",
			"td",
			"tfoot",
			"th",
			"thead",
			"tr"
		)

		val formElements = arrayOf(
			"button:autofocus,autocomplete,disabled,form,formaction,formenctype,formmethod,formnovalidate,formtarget,name,type,value",
			"datalist",
			"fieldset",
			"form",
			"input:autocomplete,autofocus,disabled,form,list,name,readonly,required,tabindex,type,value",
			"label",
			"legend",
			"meter",
			"optgroup",
			"option",
			"output",
			"progress",
			"select",
			"textarea"
		)

		val interactiveElements = arrayOf(
			"details",
			"dialog",
			"menu",
			"menuitem",
			"summary"
		)

		val webComponentElements = arrayOf(
			"content",
			"element",
			"shadow",
			"slot",
			"template"
		)

		// this array should be used  to mark generated classes as deprecated
		val deprecatedElements = arrayOf(
			"acronym",
			"applet",
			"basefont",
			"bgsound",
			"big",
			"blink",
			"center",
			"command",
			"content",
			"dir",
			"element",
			"font",
			"frame",
			"frameset",
			"image",
			"isindex",
			"keygen",
			"listing",
			"marquee",
			"menuitem",
			"multicol",
			"nextid",
			"nobr",
			"noembed",
			"noframes",
			"plaintext",
			"shadow",
			"spacer",
			"strike",
			"tt",
			"xmp"
		)

		val bodyElementDefaultAttributes = arrayOf<String>(
			"clazz",
			"style"
		)

		val bodyElements = arrayOf<String>(
			"body",
			*contentSectionElements,
			*textContentElements,
			*inlineTextSemanticElements,
			*imageMultimediaElements,
			*imageMultimediaElements,
			*embeddedContent,
			*scriptingElements,
			*demarcatingEditElements,
			*tableContentElements,
			*formElements,
			*interactiveElements
			//*deprecatedElements,
			//*webComponentElements
		)

		processBasic(elements = bodyElements, tagType = "BodyTag")
		processBasic(elements = headElements, tagType = "HeadTag")

		process(list = headElements, tagType = "HeadTag")
		process(list = bodyElements, tagType = "BodyTag")

	}

	private fun processBasic(elements: Array<String>, tagType: String) {

		val path = getPath()
		val processed = mutableSetOf<String>()

		println("Processing BodyTag")
		File("$path/src/main/kotlin/io/persephone/dsl/$tagType.kt").printWriter().use { out ->
			out.println("package io.persephone.dsl")
			out.println("")
			out.println("import io.persephone.dsl.element.*")
			out.println("")
			out.println("""abstract class $tagType(tagName: String) : TagWithText(tagName) {""")
			elements.forEach { line ->
				val parts = line.split(":")
				val element = parts[0]
				if (processed.add(element)) {
					out.println("\tfun $element(init: ${element.toUpperCase()}.() -> Unit) = initTag(${element.toUpperCase()}(), init)")
				}
			}

			out.println("""}""")
		}
	}

	private fun process(list: Array<String>, tagType: String) {

		val path = getPath()

		list.forEach { line ->

			val parts = line.split(":")
			val element = parts[0]
			val attributes = mutableListOf("clazz", "style").let {
				if (parts.size > 1) {
					it.addAll(parts[1].split(","))
				}
				it
			}

			println("Processing $element")

			File("$path/src/main/kotlin/io/persephone/dsl/element/${element.toUpperCase()}.kt").printWriter().use { out ->
				out.println("""package io.persephone.dsl.element""")
				out.println("")
				out.println("import io.persephone.dsl.HeadTag")
				out.println("import io.persephone.dsl.BodyTag")
					out.println("")
				if (attributes.isNotEmpty()) {
					out.println("""class ${element.toUpperCase()} : $tagType("$element") {""")
					out.println("")
					attributes.forEach { attribute ->
						out.println("""
						\tvar $attribute: String
						\t\tget() = attributes.getOrDefault("$attribute", "")
						\t\tset(value) {
						\t\t\tattributes["$attribute"] = value
						\t\t}
					""".trimIndent().replace("""\t""", "\t"))
						out.println("""""")
					}
					out.println("}")
				} else {
					out.println("""class ${element.toUpperCase()} : $tagType("$element")""")
				}

				out.println("")

			}

		}

	}

	private fun getPath(): String {
		return this::class.java.protectionDomain.codeSource.location.path.replace("/build/classes/kotlin/main/", "")
	}

	private fun String.toCamelCase(): String {
		val array = this.toByteArray()
		if (array.isNotEmpty()) {
			array[0] = array.first().toChar().toUpperCase().toByte()
		}
		return String(array)
	}


}
