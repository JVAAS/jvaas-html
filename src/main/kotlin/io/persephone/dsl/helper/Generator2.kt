package io.persephone.dsl.helper

import java.io.File

// based on -> Last modified: Jun 6, 2019, by MDN contributors
// https://developer.mozilla.org/en-US/docs/Web/HTML/Element

class HtmlDslGenerator {

	val globalAttributes = arrayOf(
		"accesskey", "autocapitalize", "class->classes", "contenteditable",
		// data
		"dir", "draggable", "dropzone", "hidden", "id", "inputmode", "is->isses",
		"itemid", "itemprop", "itemref", "itemscope", "itemtype", "lang", "part",
		"slot", "spellcheck", "style", "tabindex", "title", "translate"
	)

	val globalEvents = arrayOf(
		"onabort", "onautocomplete", "onautocompleteerror", "onblur", "oncancel", "oncanplay", "oncanplaythrough",
		"onchange", "onclick", "onclose", "oncontextmenu", "oncuechange", "ondblclick", "ondrag", "ondragend",
		"ondragenter", "ondragexit", "ondragleave", "ondragover", "ondragstart", "ondrop", "ondurationchange",
		"onemptied", "onended", "onerror", "onfocus", "oninput", "oninvalid", "onkeydown", "onkeypress",
		"onkeyup", "onload", "onloadeddata", "onloadedmetadata", "onloadstart", "onmousedown", "onmouseenter",
		"onmouseleave", "onmousemove", "onmouseout", "onmouseover", "onmouseup", "onmousewheel", "onpause", "onplay",
		"onplaying", "onprogress", "onratechange", "onreset", "onresize", "onscroll", "onseeked", "onseeking",
		"onselect", "onshow", "onsort", "onstalled", "onsubmit", "onsuspend", "ontimeupdate", "ontoggle",
		"onvolumechange", "onwaiting"
	)

	val gaeAttributes = arrayOf(*globalAttributes, *globalEvents)


	val root = Grouping(tag = "document")
	val html = root.grouping(
		tag = "html",
		attributes = arrayOf("xmlns", *gaeAttributes)
	)

	/**
	 * Document metadata
	 * Metadata contains information about the page. This includes information about styles, scripts
	 * and data to help software (search engines, browsers, etc.) use and render the page. Metadata for
	 * styles and scripts may be defined in the page or link to another file that has the information.
	 */
	val head = html.grouping(tag = "head", attributes = gaeAttributes)

	val base = head.element(tag = "base", attributes = arrayOf("href", "target"), selfClosing = true)
	val link = head.element(tag = "link", attributes = arrayOf("rel", "type", "href"), selfClosing = true)
	val meta = head.element(tag = "meta", attributes = arrayOf("charset", "name", "content"), selfClosing = true)
	val style = head.element(tag = "style", attributes = arrayOf("type", "media", "nonce", "title"))
	val title = head.element(tag = "title", attributes = arrayOf())

	/**
	 * Sectioning root
	 */
	val body = html.grouping(tag = "body", attributes = gaeAttributes)

	/**
	 * Content sectioning
	 *
	 * Content sectioning elements allow you to organize the document content into logical pieces.
	 * Use the sectioning elements to create a broad outline for your page content, including header
	 * and footer navigation, and heading elements to identify sections of content.
	 */
	val address = body.grouping(tag = "address", attributes = gaeAttributes, children = body.children)
	val article = body.grouping(tag = "article", children = body.children)
	val aside = body.grouping(tag = "aside", children = body.children)
	val footer = body.grouping(tag = "footer", children = body.children)
	val header = body.grouping(tag = "header", children = body.children)
	val h1 = body.element(tag = "h1")
	val h2 = body.element(tag = "h2")
	val h3 = body.element(tag = "h3")
	val h4 = body.element(tag = "h4")
	val h5 = body.element(tag = "h5")
	val h6 = body.element(tag = "h6")
	val hgroup = body.grouping(tag = "hgroup", children = body.children, deprecated = true)
	val main1 = body.grouping(tag = "main", children = body.children)
	val nav = body.grouping(tag = "nav", children = body.children)
	val section = body.grouping(tag = "section", children = body.children)

	/**
	 * Text content
	 * Use HTML text content elements to organize blocks or sections of content placed between the
	 * opening <body> and closing </body> tags. Important for accessibility and SEO, these elements
	 * identify the purpose or structure of that content.
	 */
	val blockquote = body.grouping(tag = "blockquote", children = body.children)
	val dd = body.element(tag = "dd")
	val div = body.grouping(tag = "div", children = body.children)
	val dl = body.grouping(tag = "dl", children = body.children)
	val dt = body.element(tag = "dt")
	val figcaption = body.element(tag = "figcaption")
	val figure = body.grouping(tag = "figure", children = body.children)
	val hr = body.element(tag = "hr", selfClosing = true)
	val li = body.grouping(tag = "li")
	val main2 = body.grouping(tag = "main", children = body.children)
	val ol = body.grouping(tag = "ol", children = body.children)
	val p = body.grouping(tag = "p", children = body.children)
	val pre = body.grouping(tag = "pre", children = body.children)
	val ul = body.grouping(tag = "ul", children = body.children)

	/**
	 * Inline text semantics
	 * Use the HTML inline text semantic to define the meaning, structure, or style of a word,
	 * line, or any arbitrary piece of text.
	 */
	val a = body.grouping(tag = "a")
	val abbr = body.element(tag = "abbr")
	val b = body.element(tag = "b")
	val bdi = body.element(tag = "bdi")
	val bdo = body.element(tag = "bdo")
	val br = body.element(tag = "br")
	val cite = body.element(tag = "cite")
	val code = body.element(tag = "code")
	val data = body.element(tag = "data")
	val dfn = body.element(tag = "dfn")
	val em = body.element(tag = "em")
	val i = body.element(tag = "i")
	val kbd = body.element(tag = "kbd")
	val mark = body.element(tag = "mark")
	val q = body.element(tag = "q")
	val rb = body.element(tag = "rb")
	val rp = body.element(tag = "rp")
	val rt = body.element(tag = "rt")
	val rtc = body.element(tag = "rtc")
	val ruby = body.element(tag = "ruby")
	val s = body.element(tag = "s")
	val samp = body.element(tag = "samp")
	val small = body.element(tag = "small")
	val span = body.element(tag = "span")
	val strong = body.element(tag = "strong")
	val sub = body.element(tag = "sub")
	val sup = body.element(tag = "sup")
	val time = body.element(tag = "time")
	val tt = body.element(tag = "tt", deprecated = true)
	val u = body.element(tag = "u")
	val `var` = body.element(tag = "var")
	val wbr = body.element(tag = "wbr")


	/**
	 * Image and multimedia
	 * HTML supports various multimedia resources such as images, audio, and video.
	 */
	val area = body.element(tag = "area")
	val audio = body.element(tag = "audio")
	val img = body.element(tag = "img")
	val map = body.element(tag = "map")
	val track = body.element(tag = "track")
	val video = body.element(tag = "video")


	/**
	 * Embedded content
	 * In addition to regular multimedia content, HTML can include a variety of other content,
	 * even if it's not always easy to interact with.
	 */
	val embed = body.element(tag = "embed")
	val iframe = body.element(tag = "iframe")
	val `object` = body.element(tag = "object")
	val param = body.element(tag = "param")
	val picture = body.element(tag = "picture")
	val source = body.element(tag = "source")


	/**
	 * Scripting
	 * 	In order to create dynamic content and Web applications, HTML supports the use of scripting
	 * 	languages, most prominently JavaScript. Certain elements support this capability.
	 */
	val canvas = body.element(tag = "canvas")
	val noscript = body.element(tag = "noscript")
	val script = body.element(tag = "script")

	/**
	 * Demarcating edits
	 * These elements let you provide indications that specific parts of the text have been altered.
	 */
	val del = body.element(tag = "del")
	val ins = body.element(tag = "ins")

	/**
	 * Table content
	 * The elements here are used to create and handle tabular data.
	 */
	val caption = body.grouping(tag = "caption")
	val col = body.grouping(tag = "col")
	val colgroup = body.grouping(tag = "colgroup")
	val table = body.grouping(tag = "table")
	val tbody = body.grouping(tag = "tbody")
	val td = body.grouping(tag = "td")
	val tfoot = body.grouping(tag = "tfoot")
	val th = body.grouping(tag = "th")
	val thead = body.grouping(tag = "thead")
	val tr = body.grouping(tag = "tr")

	/**
	 * Forms
	 * HTML provides a number of elements which can be used together to create forms which the user
	 * can fill out and submit to the Web site or application. There's a great deal of further
	 * information about this available in the HTML forms guide.
	 */
	val button = body.grouping(tag = "button")
	val datalist = body.grouping(tag = "datalist")
	val fieldset = body.grouping(tag = "fieldset")
	val form = body.grouping(tag = "form")
	val input = body.grouping(tag = "input")
	val label = body.grouping(tag = "label")
	val legend = body.grouping(tag = "legend")
	val meter = body.grouping(tag = "meter")
	val optgroup = body.grouping(tag = "optgroup")
	val option = body.grouping(tag = "option")
	val output = body.grouping(tag = "output")
	val progress = body.grouping(tag = "progress")
	val select = body.grouping(tag = "select")
	val textarea = body.grouping(tag = "textarea")

	/**
	 * Interactive elements
	 * HTML offers a selection of elements which help to create interactive user interface objects.
	 */
	val details = body.grouping(tag = "details")
	val dialog = body.grouping(tag = "dialog")
	val menu = body.grouping(tag = "menu")
	val menuitem1 = body.grouping(tag = "menuitem", deprecated = true)
	val summary = body.grouping(tag = "summary")

	/**
	 * Web Components
	 * Web Components is an HTML-related technology which makes it possible to, essentially,
	 * create and use custom elements as if it were regular HTML. In addition, you can create
	 * custom versions of standard HTML elements.
	 */
	val content1 = body.grouping(tag = "content", deprecated = true)
	val element1 = body.grouping(tag = "element", deprecated = true)
	val shadow1 = body.grouping(tag = "shadow", deprecated = true)
	val slot = body.grouping(tag = "slot")
	val template = body.grouping(tag = "template")

	/**
	 * Obsolete and deprecated elements
	 * Warning: These are old HTML elements which are deprecated and should not be used.
	 * You should never use them in new projects, and should replace them in old projects as soon as you can.
	 * They are listed here for informational purposes only.
	 */
	val acronym = body.grouping(tag = "acronym", deprecated = true)
	val applet = body.grouping(tag = "applet", deprecated = true)
	val basefont = body.grouping(tag = "basefont", deprecated = true)
	val bgsound = body.grouping(tag = "bgsound", deprecated = true)
	val big = body.grouping(tag = "big", deprecated = true)
	val blink = body.grouping(tag = "blink", deprecated = true)
	val center = body.grouping(tag = "center", deprecated = true)
	val command = body.grouping(tag = "command", deprecated = true)
	val content2 = body.grouping(tag = "content", deprecated = true)
	val dir = body.grouping(tag = "dir", deprecated = true)
	val element2 = body.grouping(tag = "element", deprecated = true)
	val font = body.grouping(tag = "font", deprecated = true)
	val frame = body.grouping(tag = "frame", deprecated = true)
	val frameset = body.grouping(tag = "frameset", deprecated = true)
	val image = body.grouping(tag = "image", deprecated = true)
	val isindex = body.grouping(tag = "isindex", deprecated = true)
	val keygen = body.grouping(tag = "keygen", deprecated = true)
	val listing = body.grouping(tag = "listing", deprecated = true)
	val marquee = body.grouping(tag = "marquee", deprecated = true)
	val menuitem2 = body.grouping(tag = "menuitem", deprecated = true)
	val multicol = body.grouping(tag = "multicol", deprecated = true)
	val nextid = body.grouping(tag = "nextid", deprecated = true)
	val nobr = body.grouping(tag = "nobr", deprecated = true)
	val noembed = body.grouping(tag = "noembed", deprecated = true)
	val noframes = body.grouping(tag = "noframes", deprecated = true)
	val plaintext = body.grouping(tag = "plaintext", deprecated = true)
	val shadow2 = body.grouping(tag = "shadow", deprecated = true)
	val spacer = body.grouping(tag = "spacer", deprecated = true)
	val strike = body.grouping(tag = "strike", deprecated = true)
	val tt2 = body.grouping(tag = "tt", deprecated = true)
	val xmp = body.grouping(tag = "xmp", deprecated = true)

	// grouping of elements
	val metadataContent = arrayOf(
		base, command, link, meta, noscript, script, style, title
	)
	val flowContent = arrayOf(
		a, abbr, address, article, aside, audio, b, bdo, bdi, blockquote, br, button, canvas, cite, code, command, data,
		datalist, del, details, dfn, div, dl, em, embed, fieldset, figure, footer, form, h1, h2, h3, h4, h5, h6, header,
		hgroup, hr, i, iframe, img, input, ins, kbd, keygen, label, main1, main2, map, mark,
		// TODO: implement math: https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math
		// math,
		menu, meter, nav,
		noscript, `object`, ol, output, p, picture, pre, progress, q, ruby, s, samp, script, section, select, small,
		span, strong, sub, sup,
		// TODO: implement svg: https://developer.mozilla.org/en-US/docs/Web/SVG/Element/svg
		// svg,
		table, template, textarea, time, ul, `var`, video, wbr

		// TODO: implement this specification
		/**
		 * A few other elements belong to this category, but only if a specific condition is fulfilled:
		 *
		 *	<area>, if it is a descendant of a <map> element
		 *	<link>, if the itemprop attribute is present
		 *	<meta>, if the itemprop attribute is present
		 *	<style>, if the scoped attribute is present
		 */
	)


	val sectioningContent = arrayOf(
		article, aside, nav, section
	)

	val headingContent = arrayOf(
		h1, h2, h3, h4, h5, h6, hgroup
	)

	val phrasingContent = arrayOf(
		abbr, audio, b, bdo, br, button, canvas, cite, code, command, data, datalist, dfn, em, embed, i, iframe, img,
		input, kbd, keygen, label, mark,
		// TODO: implement math
		//math,
		meter, noscript, `object`, output, picture, progress, q, ruby, samp,
		script, select, small, span, strong, sub, sup,
		// TODO: implement svg
		// svg,
		textarea, time, `var`, video, wbr

		/**
		 * A few other elements belong to this category, but only if a specific condition is fulfilled:
		 *
		 * <a>, if it contains only phrasing content
		 * <area>, if it is a descendant of a <map> element
		 * <del>, if it contains only phrasing content
		 * <ins>, if it contains only phrasing content
		 * <link>, if the itemprop attribute is present
		 * <map>, if it contains only phrasing content
		 * <meta>, if the itemprop attribute is present
		 */
	)

	val embeddedContent = arrayOf(
		canvas, embed, iframe, img,
		// TODO: implement math
		//math,
		`object`, picture,
		// TODO: implement SVG
		//svg,
		video
	)

	val interactiveContent = arrayOf(
		a, button, details, embed, iframe, keygen, label, select, textarea
		/**
		 * Some elements belong to this category only under specific conditions:
		 *
		 * <audio>, if the controls attribute is present
		 * <img>, if the usemap attribute is present
		 * <input>, if the type attribute is not in the hidden state
		 * <menu>, if the type attribute is in the toolbar state
		 * <object>, if the usemap attribute is present
		 * <video>, if the controls attribute is present
		 */
	)

	val formAssociatedContent = arrayOf(
		button, fieldset, input, keygen, label, meter, `object`, output, progress, select, textarea
	)

	val formAssociatedContentListed = arrayOf(
		button, fieldset, input, keygen, `object`, output, select, textarea
	)

	val formAssociatedContentLabelable = arrayOf(
		button, input, keygen, meter, output, progress, select, textarea
	)

	val formAssociatedContentSubmittable = arrayOf(
		button, input, keygen, `object`, select, textarea
	)

	val formAssociatedContentResetable = arrayOf(
		input, keygen, output, select, textarea
	)

	init {

		// handle children
		hgroup.children = mutableListOf(h1, h2, h3, h4, h5, h6)

		dl.children = mutableListOf(dt, dd)

		ol.children = mutableListOf(li)
		ul.children = mutableListOf(li)
		li.children = mutableListOf(ol, ul)


	}

	companion object {

		@JvmStatic
		fun main(args: Array<String>) {

			val root = HtmlDslGenerator()

			val blah = """
				

			""".trimIndent().split(",").forEach {
				print(it.replace("<", "").replace(">", "").trim() + ", ")
			}

			//println(root)


		}
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
