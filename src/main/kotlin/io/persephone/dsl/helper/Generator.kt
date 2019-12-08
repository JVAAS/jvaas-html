package io.persephone.dsl.helper

import java.io.File

object Generator {

	@JvmStatic
	fun main(args: Array<String>) {

		// elements from https://developer.mozilla.org/en-US/docs/Web/HTML/Element
		val htmlElements = arrayOf(
			ED(tag = "html", selfClosing = false, extends = "HtmlTag"),
			ED(tag = "head", selfClosing = false, extends = "EmptyTag"),
			ED(tag = "body", selfClosing = false, extends = "BodyTag")
		)

		val headElements = arrayOf(
			ED(tag = "base", selfClosing = true, extends = "HeadTag", attributes = listOf("href", "target")),
			ED(tag = "link", selfClosing = true, extends = "HeadTag", attributes = listOf("rel", "type", "href")),
			ED(tag = "meta", selfClosing = true, extends = "HeadTag", attributes = listOf("charset", "name", "content")),
			ED(tag = "style", selfClosing = false, extends = "HeadTag", attributes = listOf("type", "media", "nonce", "title")),
			ED(tag = "title", selfClosing = false, extends = "HeadTag", attributes = listOf())
		)

		val contentSectionElements = arrayOf(
			ED(tag = "address", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "article", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "aside", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "footer", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "header", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "h1", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "h2", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "h3", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "h4", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "h5", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "h6", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "hgroup", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "main", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "nav", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "section", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val textContentElements = arrayOf(
			ED(tag = "blockquote", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "dd", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "dir", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "div", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "dl", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "dt", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "figcaption", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "figure", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "hr", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "li", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "main", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "ol", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "p", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "pre", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "ul", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val inlineTextSemanticElements = arrayOf(
			ED(tag = "a", selfClosing = false, extends = "BodyTag", attributes = listOf("download", "href", "hreflang", "media", "ping", "referrerpolicy", "rel", "target", "type")),
			ED(tag = "abbr", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "b", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "bdi", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "bdo", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "br", selfClosing = true, extends = "BodyTag", attributes = listOf()),
			ED(tag = "cite", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "code", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "data", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "dfn", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "em", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "i", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "kbd", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "mark", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "q", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "rb", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "rp", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "rt", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "rtc", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "ruby", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "s", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "samp", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "small", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "span", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "strong", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "sub", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "sup", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "time", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "tt", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "u", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "varx", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "wbr", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val imageMultimediaElements = arrayOf(
			ED(tag = "area", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "audio", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "img", selfClosing = true, extends = "BodyTag", attributes = listOf("alt", "crossorigin", "decoding", "height", "importance", "ismap", "loading", "referrerpolicy", "sizes", "src", "srcset", "width", "usemap")),
			ED(tag = "map", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "track", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "video", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val embeddedContent = arrayOf(
			ED(tag = "applet", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "embed", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "iframe", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "noembed", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "objectx", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "param", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "picture", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "source", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val scriptingElements = arrayOf(
			ED(tag = "canvas", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "noscript", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "script", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val demarcatingEditElements = arrayOf(
			ED(tag = "del", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "ins", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val tableContentElements = arrayOf(
			ED(tag = "caption", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "col", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "colgroup", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "table", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "tbody", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "td", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "tfoot", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "th", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "thead", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "tr", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val formElements = arrayOf(
			ED(tag = "button", selfClosing = true, extends = "BodyTag", attributes = listOf("autofocus", "autocomplete", "disabled", "form", "formaction", "formenctype", "formmethod", "formnovalidate", "formtarget", "name", "type", "value")),
			ED(tag = "datalist", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "fieldset", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "form", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "input", selfClosing = true, extends = "BodyTag", attributes = listOf("autocomplete", "autofocus", "disabled", "form", "list", "name", "readonly", "required", "tabindex", "type", "value")),
			ED(tag = "label", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "legend", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "meter", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "optgroup", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "option", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "output", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "progress", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "select", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "textarea", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val interactiveElements = arrayOf(
			ED(tag = "details", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "dialog", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "menu", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "menuitem", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "summary", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val webComponentElements = arrayOf(
			ED(tag = "content", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "element", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "shadow", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "slot", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "template", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		// this array should be used  to mark generated classes as deprecated
		val deprecatedElements = arrayOf(
			ED(tag = "acronym", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "applet", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "basefont", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "bgsound", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "big", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "blink", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "center", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "command", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "content", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "dir", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "element", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "font", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "frame", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "frameset", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "image", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "isindex", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "keygen", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "listing", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "marquee", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "menuitem", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "multicol", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "nextid", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "nobr", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "noembed", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "noframes", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "plaintext", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "shadow", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "spacer", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "strike", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "tt", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			ED(tag = "xmp", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val bodyElements = arrayOf<ED>(
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

		// make all body elements extends BodyTag so that they can nest other body tags
		generateParentElements(elements = headElements, tagType = "HeadTag", empty = false, additionalAttributes = listOf())
		generateParentElements(elements = bodyElements, tagType = "BodyTag", additionalAttributes = listOf("classes", "styles"))

		//process(list = arrayOf("html"), tagType = "HtmlTag")
		generateChildElements(list = headElements, tagType = "HeadTag", additionalAttributes = listOf())
		generateChildElements(list = bodyElements, tagType = "BodyTag", additionalAttributes = listOf("classes", "styles"))

	}

	private fun generateParentElements(elements: Array<ED>, tagType: String, empty: Boolean = false, additionalAttributes: List<String>) {

		val path = getPath()
		val processed = mutableSetOf<String>()

		println("Processing ${tagType}Tag")
		File("$path/src/main/kotlin/io/persephone/dsl/$tagType.kt").printWriter().use { out ->
			out.println("package io.persephone.dsl")
			out.println("")
			out.println("import io.persephone.dsl.element.*")
			out.println("")
			out.println("// generated by Generator.kt [generateParentElements]")
			out.println("""abstract class $tagType(tagName: String) : TagWithText(tagName) {""")
			if (!empty) {
				elements.forEach { el ->

					val attributes = el.attributes.toMutableSet()
					attributes.addAll(additionalAttributes)

					if (processed.add(el.tag)) {
						out.println("\tfun ${el.tag}( ")

						attributes.sorted().forEach {  attribute ->
							out.println("\t\t$attribute: String? = null,")
						}

						out.println("\t\tinit: (${el.tag.toUpperCase()}.() -> Unit)? = null")
						out.println("\t) = initTag(${el.tag.toUpperCase()}(), init).apply {")
						out.println("\t\tthis.selfClosing = ${el.selfClosing == true}")
						attributes.sorted().forEach {  attribute ->
							out.println("\t\tthis.$attribute = $attribute")
						}
						out.println("\t}")
					}
				}
			}
			out.println("""}""")
		}
	}

	private fun generateChildElements(list: Array<ED>, tagType: String, additionalAttributes: List<String>) {

		val path = getPath()

		list.forEach { el ->

			println("Processing ${el.tag}")

			File("$path/src/main/kotlin/io/persephone/dsl/element/${el.tag.toUpperCase()}.kt").printWriter().use { out ->
				out.println("""package io.persephone.dsl.element""")
				out.println("")
				out.println("import io.persephone.dsl.*")
				out.println("")

				val attributes = el.attributes.toMutableList()
				attributes.addAll(additionalAttributes)

				if (attributes.isNotEmpty()) {
					out.println("// generated by Generator.kt [generateChildElements]")
					out.println("""class ${el.tag.toUpperCase()} : $tagType("${el.tag}") {""")
					out.println("")
					attributes.sorted().forEach { attribute ->
						out.println("""
						\tvar $attribute: String?
						\t\tget() = attributes.getOrDefault("$attribute", "")
						\t\tset(value) {
						\t\t\tvalue?.let {
						\t\t\t\tattributes["$attribute"] = it
						\t\t\t}
						\t\t}
					""".trimIndent().replace("""\t""", "\t"))
						out.println("""""")
					}
					out.println("}")
				} else {
					out.println("""class ${el.tag.toUpperCase()} : $tagType("${el.tag}")""")
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
