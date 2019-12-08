package io.persephone.dsl.helper

import java.io.File

object Generator {

	@JvmStatic
	fun main(args: Array<String>) {

		// elements from https://developer.mozilla.org/en-US/docs/Web/HTML/Element
		val htmlElements = arrayOf(
			Element(tag = "html", selfClosing = false, extends = "HtmlTag"),
			Element(tag = "head", selfClosing = false, extends = "EmptyTag"),
			Element(tag = "body", selfClosing = false, extends = "BodyTag")
		)

		val headElements = arrayOf(
			Element(tag = "base", selfClosing = true, extends = "HeadTag", attributes = listOf("href", "target")),
			Element(tag = "link", selfClosing = true, extends = "HeadTag", attributes = listOf("rel", "type", "href")),
			Element(tag = "meta", selfClosing = true, extends = "HeadTag", attributes = listOf("charset", "name", "content")),
			Element(tag = "style", selfClosing = false, extends = "HeadTag", attributes = listOf("type", "media", "nonce", "title")),
			Element(tag = "title", selfClosing = false, extends = "HeadTag", attributes = listOf())
		)

		val contentSectionElements = arrayOf(
			Element(tag = "address", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "article", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "aside", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "footer", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "header", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "h1", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "h2", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "h3", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "h4", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "h5", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "h6", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "hgroup", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "main", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "nav", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "section", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val textContentElements = arrayOf(
			Element(tag = "blockquote", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "dd", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "dir", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "div", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "dl", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "dt", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "figcaption", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "figure", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "hr", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "li", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "main", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "ol", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "p", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "pre", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "ul", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val inlineTextSemanticElements = arrayOf(
			Element(tag = "a", selfClosing = false, extends = "BodyTag", attributes = listOf("download", "href", "hreflang", "media", "ping", "referrerpolicy", "rel", "target", "type")),
			Element(tag = "abbr", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "b", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "bdi", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "bdo", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "br", selfClosing = true, extends = "BodyTag", attributes = listOf()),
			Element(tag = "cite", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "code", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "data", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "dfn", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "em", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "i", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "kbd", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "mark", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "q", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "rb", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "rp", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "rt", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "rtc", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "ruby", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "s", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "samp", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "small", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "span", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "strong", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "sub", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "sup", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "time", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "tt", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "u", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "varx", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "wbr", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val imageMultimediaElements = arrayOf(
			Element(tag = "area", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "audio", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "img", selfClosing = true, extends = "BodyTag", attributes = listOf("alt", "crossorigin", "decoding", "height", "importance", "ismap", "loading", "referrerpolicy", "sizes", "src", "srcset", "width", "usemap")),
			Element(tag = "map", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "track", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "video", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val embeddedContent = arrayOf(
			Element(tag = "applet", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "embed", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "iframe", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "noembed", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "objectx", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "param", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "picture", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "source", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val scriptingElements = arrayOf(
			Element(tag = "canvas", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "noscript", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "script", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val demarcatingEditElements = arrayOf(
			Element(tag = "del", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "ins", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val tableContentElements = arrayOf(
			Element(tag = "caption", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "col", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "colgroup", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "table", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "tbody", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "td", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "tfoot", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "th", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "thead", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "tr", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val formElements = arrayOf(
			Element(tag = "button", selfClosing = true, extends = "BodyTag", attributes = listOf("autofocus", "autocomplete", "disabled", "form", "formaction", "formenctype", "formmethod", "formnovalidate", "formtarget", "name", "type", "value")),
			Element(tag = "datalist", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "fieldset", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "form", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "input", selfClosing = true, extends = "BodyTag", attributes = listOf("autocomplete", "autofocus", "disabled", "form", "list", "name", "readonly", "required", "tabindex", "type", "value")),
			Element(tag = "label", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "legend", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "meter", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "optgroup", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "option", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "output", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "progress", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "select", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "textarea", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val interactiveElements = arrayOf(
			Element(tag = "details", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "dialog", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "menu", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "menuitem", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "summary", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val webComponentElements = arrayOf(
			Element(tag = "content", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "element", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "shadow", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "slot", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "template", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		// this array should be used  to mark generated classes as deprecated
		val deprecatedElements = arrayOf(
			Element(tag = "acronym", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "applet", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "basefont", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "bgsound", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "big", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "blink", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "center", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "command", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "content", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "dir", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "element", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "font", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "frame", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "frameset", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "image", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "isindex", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "keygen", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "listing", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "marquee", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "menuitem", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "multicol", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "nextid", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "nobr", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "noembed", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "noframes", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "plaintext", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "shadow", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "spacer", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "strike", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "tt", selfClosing = false, extends = "BodyTag", attributes = listOf()),
			Element(tag = "xmp", selfClosing = false, extends = "BodyTag", attributes = listOf())
		)

		val bodyElements = arrayOf<Element>(
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

	private fun generateParentElements(elements: Array<Element>, tagType: String, empty: Boolean = false, additionalAttributes: List<String>) {

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

	private fun generateChildElements(list: Array<Element>, tagType: String, additionalAttributes: List<String>) {

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
