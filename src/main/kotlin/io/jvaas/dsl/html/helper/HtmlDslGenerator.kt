package io.jvaas.dsl.html.helper

import java.io.File

// based on -> Last modified: Jun 6, 2019, by MDN contributors
// https://developer.mozilla.org/en-US/docs/Web/HTML/Element

class HtmlDslGenerator {

	val globalAttributes = arrayOf(
		Attribute("accesskey"),
		Attribute("autocapitalize"),
		Attribute("class", generates = "classes"),
		Attribute("contenteditable"),
		Attribute("contextmenu", deprecated = true),
		Attribute("data-*", implemented = false),
		Attribute("dir"),
		Attribute("draggable"),
		Attribute("dropzone", experimental = true),
		Attribute("exportparts", experimental = true),
		Attribute("hidden"),
		Attribute("id"),
		Attribute("inputmode"),
		Attribute("is", generates = "`is`"),

		Attribute("itemid"),
		Attribute("itemprop"),
		Attribute("itemref"),
		Attribute("itemscope"),
		Attribute("itemtype"),

		Attribute("lang"),
		Attribute("part"),
		Attribute("slot"),
		Attribute("spellcheck", experimental = true),
		Attribute("style"),
		Attribute("tabindex"),
		Attribute("title"),
		Attribute("translate", experimental = true)
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
	).map {
		Attribute(tag = it)
	}.toTypedArray()

	val gaeAttributes: Array<Attribute> = arrayOf(*globalAttributes, *globalEvents)


	val root = Grouping(tag = "document")
	val html = root.grouping(
		tag = "html",
		attributes = arrayOf(Attribute("xmlns"), *gaeAttributes)
	)

	/**
	 * Document metadata
	 * Metadata contains information about the page. This includes information about styles, scripts
	 * and data to help software (search engines, browsers, etc.) use and render the page. Metadata for
	 * styles and scripts may be defined in the page or link to another file that has the information.
	 */
	val head = html.grouping(tag = "head")

	val base = head.element(
		tag = "base",
		attributes = arrayOf(
			Attribute("href"),
			Attribute("target")
		),
		selfClosing = true
	)

	val link = head.element(
		tag = "link",
		attributes = arrayOf(
			Attribute("rel"),
			Attribute("type"),
			Attribute("href")
		),
		selfClosing = true
	)

	val meta = head.element(
		tag = "meta",
		attributes = arrayOf(
			Attribute("charset"),
			Attribute("name"),
			Attribute("content")
		),
		selfClosing = true
	)

	val style = head.element(
		tag = "style",
		attributes = arrayOf(
			Attribute("type"),
			Attribute("media"),
			Attribute("nonce"),
			Attribute("title")
		),
		selfClosing = false
	)

	val title = head.element(
		tag = "title",
		attributes = arrayOf(),
		selfClosing = false
	)

	/**
	 * Sectioning root
	 */
	val body = html.grouping(
		tag = "body",
		attributes = arrayOf(
			Attribute("alink", deprecated = true),
			Attribute("background", deprecated = true),
			Attribute("bgcolor", deprecated = true),
			Attribute("bottommargin", deprecated = true),
			Attribute("leftmargin", deprecated = true),
			Attribute("link", deprecated = true),
			Attribute("onafterprint"),
			Attribute("onbeforeunload"),
			Attribute("onblur"),
			Attribute("onerror"),
			Attribute("onfocus"),
			Attribute("onhashchange"),
			Attribute("onlanguagechange", experimental = true),
			Attribute("onload"),
			Attribute("onmessage"),
			Attribute("onoffline"),
			Attribute("ononline"),
			Attribute("onopstate"),
			Attribute("onredo"),
			Attribute("onresize"),
			Attribute("onstorage"),
			Attribute("onundo"),
			Attribute("onunload"),
			Attribute("rightmargin", deprecated = true),
			Attribute("text", deprecated = true),
			Attribute("topmargin", deprecated = true),
			Attribute("vlink", deprecated = true),
			*gaeAttributes
		)
	)

	/**
	 * Content sectioning
	 *
	 * Content sectioning elements allow you to organize the document content into logical pieces.
	 * Use the sectioning elements to create a broad outline for your page content, including header
	 * and footer navigation, and heading elements to identify sections of content.
	 */
	val address = body.grouping(
		tag = "address",
		attributes = gaeAttributes
	)

	val article = body.grouping(
		tag = "article",
		attributes = gaeAttributes
	)

	val aside = body.grouping(
		tag = "aside",
		attributes = gaeAttributes
	)

	val footer = body.grouping(
		tag = "footer",
		attributes = gaeAttributes
	)

	val header = body.grouping(
		tag = "header",
		attributes = gaeAttributes
	)

	val h1 = body.grouping(
		tag = "h1",
		attributes = gaeAttributes
	)

	val h2 = body.grouping(
		tag = "h2",
		attributes = gaeAttributes
	)

	val h3 = body.grouping(
		tag = "h3",
		attributes = gaeAttributes
	)

	val h4 = body.grouping(
		tag = "h4",
		attributes = gaeAttributes
	)

	val h5 = body.grouping(
		tag = "h5",
		attributes = gaeAttributes
	)

	val h6 = body.grouping(
		tag = "h6",
		attributes = gaeAttributes
	)

	val hgroup = body.grouping(
		tag = "hgroup",
		attributes = gaeAttributes, deprecated = true
	)

	val main1 = body.grouping(
		tag = "main",
		attributes = gaeAttributes,
		generates = "`main`"
	)

	val nav = body.grouping(
		tag = "nav",
		attributes = gaeAttributes
	)

	val section = body.grouping(
		tag = "section",
		attributes = gaeAttributes
	)

	/**
	 * Text content
	 * Use HTML text content elements to organize blocks or sections of content placed between the
	 * opening <body> and closing </body> tags. Important for accessibility and SEO, these elements
	 * identify the purpose or structure of that content.
	 */
	val blockquote = body.grouping(
		tag = "blockquote",
		attributes = arrayOf(
			Attribute("cite"),
			*gaeAttributes
		)
	)

	val dd = body.grouping(
		tag = "dd",
		attributes = arrayOf(
			Attribute("nowrap", standardized = false),
			*gaeAttributes
		)
	)

	val div = body.grouping(
		tag = "div",
		attributes = gaeAttributes
	)

	val dl = body.grouping(
		tag = "dl",
		attributes = gaeAttributes
	)

	val dt = body.grouping(
		tag = "dt",
		attributes = gaeAttributes
	)

	val figcaption = body.grouping(
		tag = "figcaption",
		attributes = gaeAttributes
	)

	val figure = body.grouping(
		tag = "figure",
		attributes = gaeAttributes
	)

	val hr = body.element(
		tag = "hr",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			Attribute("color", standardized = false),
			Attribute("noshade", deprecated = true),
			Attribute("size", deprecated = true),
			Attribute("width", deprecated = true),
			*gaeAttributes
		),
		selfClosing = true
	)

	val li = body.grouping(
		tag = "li",
		attributes = arrayOf(
			Attribute("value", deprecated = false),
			Attribute("type", deprecated = true),
			*gaeAttributes
		)
	)

	val main2 = body.grouping(
		tag = "main",
		attributes = gaeAttributes,
		generates = "`main`"
	)

	val ol = body.grouping(
		tag = "ol",
		attributes = arrayOf(
			Attribute("reversed"),
			Attribute("start"),
			Attribute("type"),
			*gaeAttributes
		)
	)

	val p = body.grouping(
		tag = "p",
		attributes = gaeAttributes
	)

	val pre = body.grouping(
		tag = "pre",
		attributes = arrayOf(
			Attribute("cols", deprecated = true),
			Attribute("width", deprecated = true),
			Attribute("wrap", standardized = false),
			*gaeAttributes
		)
	)

	val ul = body.grouping(
		tag = "ul",
		attributes = arrayOf(
			Attribute("compact", deprecated = true),
			Attribute("type", deprecated = true),
			*gaeAttributes
		)
	)

	/**
	 * Inline text semantics
	 * Use the HTML inline text semantic to define the meaning, structure, or style of a word,
	 * line, or any arbitrary piece of text.
	 */
	val a = body.grouping(
		tag = "a",
		attributes = arrayOf(
			Attribute("download"),
			Attribute("href"),
			Attribute("hreflang"),
			Attribute("ping"),
			Attribute("referrerpolicy", experimental = true),
			Attribute("rel"),
			Attribute("target"),
			Attribute("type"),

			Attribute("charset", deprecated = true),
			Attribute("coords", deprecated = true),
			Attribute("name", deprecated = true),
			Attribute("rev", deprecated = true),
			Attribute("shape", deprecated = true),

			*gaeAttributes
		)

	)

	val abbr = body.grouping(
		tag = "abbr",
		attributes = gaeAttributes
	)

	val b = body.grouping(
		tag = "b",
		attributes = gaeAttributes
	)

	val bdi = body.grouping(
		tag = "bdi",
		attributes = gaeAttributes
	)

	val bdo = body.grouping(
		tag = "bdo",
		attributes = arrayOf(
			Attribute("dir"),
			*gaeAttributes
		)

	)

	val br = body.element(
		tag = "br",
		attributes = arrayOf(
			Attribute("clear", deprecated = true),
			*gaeAttributes
		),
		selfClosing = true
	)

	val cite = body.grouping(
		tag = "cite",
		attributes = gaeAttributes
	)

	val code = body.grouping(
		tag = "code",
		attributes = gaeAttributes
	)

	val data = body.grouping(
		tag = "data",
		attributes = arrayOf(
			Attribute("value"),
			*gaeAttributes
		)
	)

	val dfn = body.grouping(
		tag = "dfn",
		attributes = gaeAttributes
	)

	val em = body.grouping(
		tag = "em",
		attributes = gaeAttributes
	)

	val i = body.grouping(
		tag = "i",
		attributes = gaeAttributes
	)

	val kbd = body.grouping(
		tag = "kbd",
		attributes = gaeAttributes
	)

	val mark = body.grouping(
		tag = "mark",
		attributes = gaeAttributes
	)

	val q = body.grouping(
		tag = "q",
		attributes = arrayOf(
			Attribute("cite"),
			*gaeAttributes
		)
	)

	val rb = body.element(
		tag = "rb",
		attributes = gaeAttributes
	)

	val rp = body.element(
		tag = "rp",
		attributes = gaeAttributes
	)

	val rt = body.grouping(
		tag = "rt",
		attributes = gaeAttributes
	)

	val rtc = body.grouping(
		tag = "rtc",
		attributes = gaeAttributes
	)

	val ruby = body.grouping(
		tag = "ruby",
		attributes = gaeAttributes
	)

	val s = body.grouping(
		tag = "s",
		attributes = gaeAttributes
	)

	val samp = body.grouping(
		tag = "samp",
		attributes = gaeAttributes
	)

	val small = body.grouping(
		tag = "small",
		attributes = gaeAttributes
	)

	val span = body.grouping(
		tag = "span",
		attributes = gaeAttributes
	)

	val strong = body.grouping(
		tag = "strong",
		attributes = gaeAttributes
	)

	val sub = body.grouping(
		tag = "sub",
		attributes = gaeAttributes
	)

	val sup = body.grouping(
		tag = "sup",
		attributes = gaeAttributes
	)

	val time = body.grouping(
		tag = "time",
		attributes = arrayOf(
			Attribute("datetime"),
			*gaeAttributes
		)
	)

	val tt = body.grouping(
		tag = "tt",
		attributes = gaeAttributes,
		deprecated = true
	)

	val u = body.grouping(
		tag = "u",
		attributes = gaeAttributes
	)

	val `var` = body.grouping(
		tag = "var",
		generates = "`var`",
		attributes = gaeAttributes
	)

	val wbr = body.element(
		tag = "wbr",
		attributes = gaeAttributes
	)


	/**
	 * Image and multimedia
	 * HTML supports various multimedia resources such as images, audio, and video.
	 */
	val area = body.element(
		tag = "area",
		attributes = arrayOf(
			Attribute("alt"),
			Attribute("coords"),
			Attribute("download"),
			Attribute("href"),
			Attribute("hreflang"),
			Attribute("name", deprecated = true),
			Attribute("nohref", deprecated = true),
			Attribute("ping"),
			Attribute("referrerpolicy", experimental = true),
			Attribute("rel"),
			Attribute("shape"),
			Attribute("tabindex", deprecated = true),
			Attribute("target"),
			Attribute("type"),
			*gaeAttributes
		),
		selfClosing = false
	)

	val audio = body.grouping(
		tag = "audio",
		attributes = arrayOf(
			Attribute("autoplay"),
			Attribute("controls"),
			Attribute("crossorigin"),
			Attribute("currentTime"),
			Attribute("disableRemotePlayback", experimental = true),
			Attribute("duration", readonly = true),
			Attribute("loop"),
			Attribute("muted"),
			Attribute("preload"),
			Attribute("src"),

			Attribute("audioprocess"),
			Attribute("canplay"),
			Attribute("canplaythrough"),
			Attribute("complete"),
			Attribute("durationchange"),
			Attribute("emptied"),
			Attribute("ended"),
			Attribute("loadeddata"),
			Attribute("loadedmetadata"),
			Attribute("pause"),
			Attribute("play"),
			Attribute("playing"),
			Attribute("ratechange"),
			Attribute("seeked"),
			Attribute("seeking"),
			Attribute("stalled"),
			Attribute("suspend"),
			Attribute("timeupdate"),
			Attribute("volumechange"),
			Attribute("waiting"),

			*gaeAttributes
		)
	)

	val img = body.element(
		tag = "img",
		attributes = arrayOf(
			Attribute("alt"),
			Attribute("crossorigin"),
			Attribute("decoding"),
			Attribute("height"),
			Attribute("importance", experimental = true),
			Attribute("intrinsicsize", deprecated = true),
			Attribute("ismap"),
			Attribute("loading", experimental = true),
			Attribute("referrerpolicy", experimental = true),
			Attribute("sizes"),
			Attribute("src"),
			Attribute("srcset"),
			Attribute("width"),
			Attribute("usemap"),

			Attribute("align", deprecated = true),
			Attribute("border", deprecated = true),
			Attribute("hspace", deprecated = true),
			Attribute("longdesc", deprecated = true),
			Attribute("name", deprecated = true),
			Attribute("vspace", deprecated = true),

			*gaeAttributes
		),
		selfClosing = true
	)

	val map = body.grouping(
		tag = "map",
		attributes = arrayOf(
			Attribute("name"),
			*gaeAttributes
		)
	)

	val track = body.element(
		tag = "track",
		attributes = arrayOf(
			Attribute("default"),
			Attribute("kind"),
			Attribute("label"),
			Attribute("src"),
			Attribute("srclang"),

			*gaeAttributes
		),
		selfClosing = true
	)

	val video = body.grouping(
		tag = "video",
		attributes = arrayOf(
			Attribute("autoplay"),
			Attribute("autoPictureInPicture", experimental = true),
			Attribute("buffered"),
			Attribute("controls"),
			Attribute("controllist", experimental = true),
			Attribute("crossorigin"),
			Attribute("currentTime"),
			Attribute("disablePictureInPicture", experimental = true),
			Attribute("disableRemotePlayback", experimental = true),
			Attribute("duration", readonly = true),
			Attribute("height"),
			Attribute("intrinsicsize", experimental = true),
			Attribute("loop"),
			Attribute("muted"),
			Attribute("playsinline"),
			Attribute("poster"),
			Attribute("preload"),
			Attribute("src"),
			Attribute("width"),

			Attribute("audioprocess", deprecated = true),
			Attribute("canplay"),
			Attribute("canplaythrough"),
			Attribute("complete"),
			Attribute("durationchange"),
			Attribute("emptied"),
			Attribute("ended"),
			Attribute("loadeddata"),
			Attribute("loadedmetadata"),
			Attribute("pause"),
			Attribute("play"),
			Attribute("playing"),
			Attribute("progress"),
			Attribute("ratechange"),
			Attribute("seeked"),
			Attribute("seeking"),
			Attribute("stalled"),
			Attribute("suspend"),
			Attribute("timeupdate"),
			Attribute("volumechanged"),
			Attribute("waiting"),

			*gaeAttributes
		)
	)

	/**
	 * Embedded content
	 * In addition to regular multimedia content, HTML can include a variety of other content,
	 * even if it's not always easy to interact with.
	 */
	val embed = body.element(
		tag = "embed",
		attributes = arrayOf(
			Attribute("height"),
			Attribute("src"),
			Attribute("type"),
			Attribute("width"),

			*gaeAttributes
		),
		selfClosing = true)
	val iframe = body.element(
		tag = "iframe",
		attributes = arrayOf(
			Attribute("allow"),
			Attribute("allowfullscreen"),
			Attribute("allowpaymentrequest"),
			Attribute("csp", experimental = true),
			Attribute("height"),
			Attribute("importance", experimental = true),
			Attribute("loading", experimental = true),
			Attribute("name"),
			Attribute("referrerpolicy"),
			Attribute("sandbox"),
			Attribute("src"),
			Attribute("srcdoc"),
			Attribute("width"),

			Attribute("align", deprecated = true),
			Attribute("frameborder", deprecated = true),
			Attribute("longdesc", deprecated = true),
			Attribute("marginheight", deprecated = true),
			Attribute("marginwidth", deprecated = true),
			Attribute("scrolling", deprecated = true),

			* gaeAttributes
		)
	)
	val `object` = body.grouping(
		tag = "object",
		attributes = arrayOf(
			Attribute("archive", deprecated = true),
			Attribute("border", deprecated = true),
			Attribute("classid", deprecated = true),
			Attribute("codebase", deprecated = true),
			Attribute("codetype", deprecated = true),
			Attribute("data"),
			Attribute("declare", deprecated = true),
			Attribute("form"),
			Attribute("height"),
			Attribute("name"),
			Attribute("standby", deprecated = true),
			Attribute("tabindex", deprecated = true),
			Attribute("type"),
			Attribute("typemustmatch"),
			Attribute("usemap"),
			Attribute("width"),

			*gaeAttributes
		),
		generates = "`object`"
	)
	val param = body.element(
		tag = "param",
		attributes = arrayOf(
			Attribute("name"),
			Attribute("type", deprecated = true),
			Attribute("value"),
			Attribute("valuetype", deprecated = true),

			*gaeAttributes
		)
	)
	val picture = body.grouping(
		tag = "picture",
		attributes = gaeAttributes
	)
	val source = body.element(
		tag = "source",
		attributes = arrayOf(
			Attribute("media"),
			Attribute("sizes"),
			Attribute("src"),
			Attribute("srcset"),
			Attribute("type"),

			*gaeAttributes
		)
	)

	/**
	 * Scripting
	 * 	In order to create dynamic content and Web applications, HTML supports the use of scripting
	 * 	languages, most prominently JavaScript. Certain elements support this capability.
	 */
	val canvas = body.grouping(
		tag = "canvas",
		attributes = arrayOf(
			Attribute("height"),
			Attribute("width"),

			*gaeAttributes
		)
	)
	val noscript = body.grouping(
		tag = "noscript",
		attributes = gaeAttributes
	)
	val script = body.element(
		tag = "script",
		attributes = arrayOf(
			Attribute("async"),
			Attribute("crossorigin"),
			Attribute("defer"),
			Attribute("integrity"),
			Attribute("nomodule"),
			Attribute("nonce"),
			Attribute("referrerpolicy"),
			Attribute("src"),
			Attribute("type"),
			Attribute("charset", deprecated = true),
			Attribute("language", deprecated = true),

			*gaeAttributes
		)
	)

	/**
	 * Demarcating edits
	 * These elements let you provide indications that specific parts of the text have been altered.
	 */
	val del = body.element(
		tag = "del",
		attributes = arrayOf(
			Attribute("cite"),
			Attribute("datetime"),

			*gaeAttributes
		)
	)
	val ins = body.element(
		tag = "ins",
		attributes = arrayOf(
			Attribute("cite"),
			Attribute("datetime"),

			*gaeAttributes
		)
	)

	/**
	 * Table content
	 * The elements here are used to create and handle tabular data.
	 */
	val caption = body.grouping(
		tag = "caption",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			*gaeAttributes
		)
	)
	val col = body.element(
		tag = "col",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			Attribute("bgcolor", standardized = false, deprecated = true),
			Attribute("char", deprecated = true),
			Attribute("charoff", deprecated = true),
			Attribute("span"),
			Attribute("valign", deprecated = true),
			Attribute("width", deprecated = true),
			*gaeAttributes
		)
	)
	val colgroup = body.grouping(
		tag = "colgroup",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			Attribute("bgcolor", standardized = false, deprecated = true),
			Attribute("char", deprecated = true),
			Attribute("charoff", deprecated = true),
			Attribute("span"),
			Attribute("valign", deprecated = true),
			Attribute("width", deprecated = true),
			*gaeAttributes
		)
	)
	val table = body.grouping(
		tag = "table",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			Attribute("bgcolor", deprecated = true),
			Attribute("border", deprecated = true),
			Attribute("cellpadding", deprecated = true),
			Attribute("cellspacing", deprecated = true),
			Attribute("frame", deprecated = true),
			Attribute("rules", deprecated = true),
			Attribute("summary", deprecated = true),
			Attribute("width", deprecated = true),
			*gaeAttributes
		)
	)
	val tbody = body.grouping(
		tag = "tbody",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			Attribute("bgcolor", standardized = false, deprecated = true),
			Attribute("char", deprecated = true),
			Attribute("charoff", deprecated = true),
			Attribute("valign", deprecated = true),
			*gaeAttributes
		)
	)
	val td = body.grouping(
		tag = "td",
		attributes = arrayOf(
			Attribute("abbr", deprecated = true),
			Attribute("align", deprecated = true),
			Attribute("axis", deprecated = true),
			Attribute("bgcolor", deprecated = true),
			Attribute("char", deprecated = true),
			Attribute("charoff", deprecated = true),
			Attribute("colspan"),
			Attribute("headers"),
			Attribute("height", deprecated = true),
			Attribute("rowspan"),
			Attribute("scope", deprecated = true),
			Attribute("valign", deprecated = true),
			Attribute("width", deprecated = true),
			*gaeAttributes
		)
	)
	val tfoot = body.grouping(
		tag = "tfoot",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			Attribute("bgcolor", standardized = false, deprecated = true),
			Attribute("char", deprecated = true),
			Attribute("charoff", deprecated = true),
			Attribute("valign", deprecated = true),
			*gaeAttributes
		)
	)
	val th = body.grouping(
		tag = "th",
		attributes = arrayOf(
			Attribute("abbr"),
			Attribute("align", deprecated = true),
			Attribute("axis", deprecated = true),
			Attribute("bgcolor", deprecated = true),
			Attribute("char", deprecated = true),
			Attribute("charoff", deprecated = true),
			Attribute("colspan"),
			Attribute("headers"),
			Attribute("height", deprecated = true),
			Attribute("rowspan"),
			Attribute("scope"),
			Attribute("valign", deprecated = true),
			Attribute("width", deprecated = true),
			*gaeAttributes
		)
	)
	val thead = body.grouping(
		tag = "thead",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			Attribute("bgcolor", standardized = false, deprecated = true),
			Attribute("char", deprecated = true),
			Attribute("charoff", deprecated = true),
			Attribute("valign", deprecated = true),
			*gaeAttributes
		)
	)
	val tr = body.grouping(
		tag = "tr",
		attributes = arrayOf(
			Attribute("align", deprecated = true),
			Attribute("bgcolor", standardized = false, deprecated = true),
			Attribute("char", deprecated = true),
			Attribute("charoff", deprecated = true),
			Attribute("valign", deprecated = true),
			*gaeAttributes
		)
	)

	/**
	 * Forms
	 * HTML provides a number of elements which can be used together to create forms which the user
	 * can fill out and submit to the Web site or application. There's a great deal of further
	 * information about this available in the HTML forms guide.
	 */
	val button = body.grouping(
		tag = "button",
		attributes = arrayOf(
			Attribute("autofocus"),
			Attribute("autocomplete", standardized = false),
			Attribute("disabled"),
			Attribute("form"),
			Attribute("formaction"),
			Attribute("formenctype"),
			Attribute("formmethod"),
			Attribute("formnovalidate"),
			Attribute("formtarget"),
			Attribute("name"),
			Attribute("type"),
			Attribute("value"),
			*gaeAttributes
		)
	)
	val datalist = body.grouping(
		tag = "datalist",
		attributes = gaeAttributes
	)
	val fieldset = body.grouping(
		tag = "fieldset",
		attributes = arrayOf(
			Attribute("disabled"),
			Attribute("form"),
			Attribute("name"),
			*gaeAttributes
		)
	)
	val form = body.grouping(
		tag = "form",
		attributes = arrayOf(
			Attribute("accept", deprecated = true),
			Attribute("accept-charset", generates = "acceptCharset"),
			Attribute("action"),
			Attribute("autocapitalize", standardized = false),
			Attribute("autocomplete"),
			Attribute("enctype"),
			Attribute("method"),
			Attribute("name"),
			Attribute("novalidate"),
			Attribute("target"),
			*gaeAttributes
		)
	)
	val input = body.grouping(
		tag = "input",
		attributes = arrayOf(
			Attribute("accept"),
			Attribute("alt"),
			Attribute("autocomplete"),
			Attribute("autofocus"),
			Attribute("capture"),
			Attribute("checked"),
			Attribute("dirname"),
			Attribute("disabled"),
			Attribute("form"),
			Attribute("formaction"),
			Attribute("formenctype"),
			Attribute("formmethod"),
			Attribute("formnovalidate"),
			Attribute("formtarget"),
			Attribute("height"),
			Attribute("id"),
			Attribute("inputmode"),
			Attribute("list"),
			Attribute("max"),
			Attribute("maxlength"),
			Attribute("min"),
			Attribute("minlength"),
			Attribute("multiple"),
			Attribute("name"),
			Attribute("pattern"),
			Attribute("placeholder"),
			Attribute("readonly"),
			Attribute("required"),
			Attribute("size"),
			Attribute("src"),
			Attribute("step"),
			Attribute("tabindex"),
			Attribute("title"),
			Attribute("type"),
			Attribute("value"),
			Attribute("width"),
			*gaeAttributes
		)
	)
	val label = body.grouping(
		tag = "label",
		attributes = arrayOf(
			Attribute("for", generates = "`for`"),
			Attribute("form"),
			*gaeAttributes
		)
	)
	val legend = body.grouping(
		tag = "legend",
		attributes = gaeAttributes
	)
	val meter = body.grouping(
		tag = "meter",
		attributes = arrayOf(
			Attribute("value"),
			Attribute("min"),
			Attribute("max"),
			Attribute("low"),
			Attribute("high"),
			Attribute("optimum"),
			Attribute("form"),
			*gaeAttributes
		)
	)
	val optgroup = body.grouping(
		tag = "optgroup",
		attributes = arrayOf(
			Attribute("disabled"),
			Attribute("label"),
			*gaeAttributes
		)
	)
	val option = body.grouping(
		tag = "option",
		attributes = arrayOf(
			Attribute("disabled"),
			Attribute("label"),
			Attribute("selected"),
			Attribute("value"),
			*gaeAttributes
		)
	)
	val output = body.grouping(
		tag = "output",
		attributes = arrayOf(
			Attribute("for", generates = "`for`"),
			Attribute("form"),
			Attribute("name"),
			*gaeAttributes
		)
	)
	val progress = body.grouping(
		tag = "progress",
		attributes = arrayOf(
			Attribute("max"),
			Attribute("value"),
			*gaeAttributes
		)
	)
	val select = body.grouping(
		tag = "select",
		attributes = arrayOf(
			Attribute("autocomplete"),
			Attribute("autofocus"),
			Attribute("disabled"),
			Attribute("form"),
			Attribute("multiple"),
			Attribute("name"),
			Attribute("required"),
			Attribute("size"),
			*gaeAttributes
		)
	)
	val textarea = body.grouping(
		tag = "textarea",
		attributes = arrayOf(
			Attribute("autocapitalize"),
			Attribute("autocomplete"),
			Attribute("autofocus"),
			Attribute("cols"),
			Attribute("disabled"),
			Attribute("form"),
			Attribute("maxlength"),
			Attribute("minlength"),
			Attribute("name"),
			Attribute("placeholder"),
			Attribute("readonly"),
			Attribute("required"),
			Attribute("rows"),
			Attribute("spellcheck"),
			Attribute("wrap"),
			*gaeAttributes
		)
	)

	/**
	 * Interactive elements
	 * HTML offers a selection of elements which help to create interactive user interface objects.
	 */
	val details = body.grouping(
		tag = "details",
		attributes = arrayOf(
			Attribute("open"),
			*gaeAttributes
		)
	)
	val dialog = body.grouping(
		tag = "dialog",
		attributes = arrayOf(
			Attribute("open"),
			*gaeAttributes
		)
	)
	val menu = body.grouping(
		tag = "menu",
		attributes = arrayOf(
			Attribute("label", deprecated = true),
			Attribute("type"),
			*gaeAttributes
		)
	)
	val menuitem = body.element(
		tag = "menuitem",
		attributes = arrayOf(
			Attribute("checked"),
			Attribute("command"),
			Attribute("default"),
			Attribute("disabled"),
			Attribute("icon"),
			Attribute("label"),
			Attribute("radiogroup"),
			Attribute("type"),
			*gaeAttributes
		),
		deprecated = true)
	val summary = body.grouping(
		tag = "summary",
		attributes = gaeAttributes
	)

	/**
	 * Web Components
	 * Web Components is an HTML-related technology which makes it possible to, essentially,
	 * create and use custom elements as if it were regular HTML. In addition, you can create
	 * custom versions of standard HTML elements.
	 */
	val content = body.grouping(
		tag = "content",
		attributes = arrayOf(
			Attribute("select"),
			*gaeAttributes
		),
		deprecated = true
	)
	val element = body.grouping(
		tag = "element",
		attributes = gaeAttributes,
		deprecated = true
	)
	val shadow = body.grouping(
		tag = "shadow",
		attributes = gaeAttributes,
		deprecated = true
	)
	val slot = body.grouping(
		tag = "slot",
		attributes = arrayOf(
			Attribute("name"),
			*gaeAttributes
		)
	)
	val template = body.grouping(
		tag = "template",
		attributes = gaeAttributes
	)

	// grouping of elements
	val metadataContent = arrayOf(
		base, link, meta, noscript, script, style, title
	)
	val flowContent = arrayOf(
		a, abbr, address, article, aside, audio, b, bdo, bdi, blockquote, br, button, canvas, cite, code, data,
		datalist, del, details, dfn, div, dl, em, embed, fieldset, figure, footer, form, h1, h2, h3, h4, h5, h6, header,
		hgroup, hr, i, iframe, img, input, ins, kbd, label, main1, main2, map, mark,
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
		abbr, audio, b, bdo, br, button, canvas, cite, code, data, datalist, dfn, em, embed, i, iframe, img,
		input, kbd, label, mark,
		// TODO: implement math
		//math,
		meter, noscript, `object`, output, picture, progress, q, ruby, samp,
		script, select, small, span, strong, sub, sup,
		// TODO: implement svg
		// svg,
		textarea, time, `var`, video, wbr,

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

		a, area, del, ins, link, map, meta

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
		a, button, details, embed, iframe, label, select, textarea
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
		button, fieldset, input, label, meter, `object`, output, progress, select, textarea
	)

	val formAssociatedContentListed = arrayOf(
		button, fieldset, input, `object`, output, select, textarea
	)

	val formAssociatedContentLabelable = arrayOf(
		button, input, meter, output, progress, select, textarea
	)

	val formAssociatedContentSubmittable = arrayOf(
		button, input, `object`, select, textarea
	)

	val formAssociatedContentResetable = arrayOf(
		input, output, select, textarea
	)

	init {

		head.children = metadataContent.toMutableList()

		body.children = flowContent.toMutableList()

		// content sectioning

		address.children = flowContent.minus(address).minus(*headingContent).minus(*sectioningContent).minus(header).minus(footer).toMutableList()

		article.children = flowContent.toMutableList()

		aside.children = flowContent.toMutableList()

		footer.children = flowContent.minus(footer).minus(header).toMutableList()

		header.children = flowContent.minus(footer).minus(header).toMutableList()

		h1.children = phrasingContent.toMutableList()
		h2.children = phrasingContent.toMutableList()
		h3.children = phrasingContent.toMutableList()
		h4.children = phrasingContent.toMutableList()
		h5.children = phrasingContent.toMutableList()
		h6.children = phrasingContent.toMutableList()

		hgroup.children = mutableListOf(
			h1, h2, h3, h4, h5, h6
		)

		main1.children = flowContent.toMutableList()

		nav.children = flowContent.toMutableList()

		section.children = flowContent.toMutableList()

		// text content

		blockquote.children = flowContent.toMutableList()

		dd.children = flowContent.toMutableList()

		div.children = flowContent.toMutableList()

		dl.children = mutableListOf(dt, dd, div)

		dt.children = flowContent.minus(header).minus(footer).minus(*sectioningContent).minus(*headingContent).toMutableList()

		figcaption.children = flowContent.toMutableList()

		figure.children = flowContent.plus(figcaption).toMutableList()

		li.children = flowContent.toMutableList()

		main2.children = flowContent.toMutableList()

		ol.children = mutableListOf(li, script, template)

		p.children = phrasingContent.toMutableList()

		pre.children = phrasingContent.toMutableList()

		ul.children = mutableListOf(li, script, template)

		// inline text semantics

		a.children = flowContent.minus(*interactiveContent).plus(*phrasingContent).toMutableList()

		abbr.children = phrasingContent.toMutableList()

		b.children = phrasingContent.toMutableList()

		bdi.children = phrasingContent.toMutableList()

		bdo.children = phrasingContent.toMutableList()

		cite.children = phrasingContent.toMutableList()

		code.children = phrasingContent.toMutableList()

		data.children = phrasingContent.toMutableList()

		dfn.children = phrasingContent.minus(dfn).toMutableList()

		em.children = phrasingContent.toMutableList()

		i.children = phrasingContent.toMutableList()

		kbd.children = phrasingContent.toMutableList()

		mark.children = phrasingContent.toMutableList()

		q.children = phrasingContent.toMutableList()

		rt.children = phrasingContent.toMutableList()

		rtc.children = phrasingContent.plus(rt).toMutableList()

		ruby.children = phrasingContent.toMutableList()

		s.children = phrasingContent.toMutableList()

		samp.children = phrasingContent.toMutableList()

		small.children = phrasingContent.toMutableList()

		span.children = phrasingContent.toMutableList()

		strong.children = phrasingContent.toMutableList()

		sub.children = phrasingContent.toMutableList()

		sup.children = phrasingContent.toMutableList()

		time.children = phrasingContent.toMutableList()

		tt.children = phrasingContent.toMutableList()

		u.children = phrasingContent.toMutableList()

		`var`.children = phrasingContent.toMutableList()

		// image and multimedia

		// TODO: handle "transparent" content in here as well
		audio.children = mutableListOf(track, source)

		map.children = mutableListOf(area)

		// TODO: handle "transparent" content in here as well
		video.children = mutableListOf(track, source)

		// TODO: handle "transparent" content in here as well

		// embedded content

		`object`.children = mutableListOf(param)

		picture.children = mutableListOf(source, img)

		canvas.children = mutableListOf(a, button, input)

		noscript.children = mutableListOf(

			// if inside head element
			link, style, meta,

			// if inside body element
			*flowContent.plus(*phrasingContent).minus(noscript)

		)

		// table element

		caption.children = flowContent.toMutableList()

		colgroup.children = mutableListOf(col)

		table.children = mutableListOf(caption, colgroup, thead, tbody, tr, tfoot)

		tbody.children = mutableListOf(tr)

		td.children = flowContent.toMutableList()

		tfoot.children = mutableListOf(tr)

		th.children = flowContent.minus(header).minus(footer).minus(*sectioningContent).minus(*headingContent).toMutableList()

		thead.children = mutableListOf(tr)

		tr.children = mutableListOf(td, th)

		// forms

		button.children = phrasingContent.minus(*interactiveContent).toMutableList()

		datalist.children = phrasingContent.plus(option).toMutableList()

		fieldset.children = flowContent.plus(legend).toMutableList()

		form.children = flowContent.minus(form).toMutableList()

		label.children = phrasingContent.minus(label).toMutableList()

		legend.children = phrasingContent.toMutableList()

		meter.children = phrasingContent.minus(meter).toMutableList()

		optgroup.children = mutableListOf(option)

		output.children = phrasingContent.toMutableList()

		progress.children = phrasingContent.minus(progress).toMutableList()

		select.children = mutableListOf(option, optgroup)

		// interactive elements

		details.children = flowContent.plus(summary).toMutableList()

		dialog.children = flowContent.toMutableList()

		menu.children = flowContent.plus(li).plus(menuitem, hr).toMutableList()

		summary.children = phrasingContent.plus(*headingContent).toMutableList()

		content.children = flowContent.toMutableList()

		// web components

		template.children = body.children


	}

	private inline fun <reified T : Any> Array<T>.plus(vararg t: T): Array<T> {

		var input = this.copyOf().toSet()
		t.forEach {
			input = input.plus(it)
		}

		return input.toTypedArray()

	}

	private inline fun <reified T : Any> Array<T>.minus(vararg t: T): Array<T> {

		var input = this.copyOf().toSet()
		t.forEach {
			input = input.minus(it)
		}

		return input.toTypedArray()

	}


	companion object {

		private fun extractElements(
			grouping: Grouping,
			elements: MutableMap<String, Element> = mutableMapOf()
		): List<Element> {

			grouping.children.forEach {
				if (it is Grouping) {
					if (!elements.containsKey(it.tag)) {
						elements.putIfAbsent(it.tag, it)
						extractElements(grouping = it, elements = elements)
					}
				} else {
					elements.putIfAbsent(it.tag, it)
				}
			}

			return elements.values.toList().sortedBy { it.tag }

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

		private fun String.makeTabs(): String {
			return this.replace("""\t""", "\t")
		}

		@JvmStatic
		fun main(args: Array<String>) {

			HtmlDslGenerator().let {
				val elements = extractElements(it.root).toSet().toList()
				val path = getPath()


				elements.forEach { el ->
					println(el.tag)


					File(
						"$path/src/main/kotlin/io/jvaas/dsl/html/element/${el.tag.toUpperCase()}.kt"
					).printWriter().use { out ->
						out.println("""package io.jvaas.dsl.html.element""")
						out.println("")
						out.println("import io.jvaas.dsl.html.*")
						out.println("")

						// extract attributes and children
						val attributes = el.attributes.
							distinctBy { it.generates ?: it.tag }.
							filter { !it.deprecated }.
							filter { it.standardized }.
							filter { !it.experimental }.
							filter { it.implemented }.
							sortedBy { it.tag }.
							toMutableList()

						val children = if (el is Grouping) {
							el.children.toList()
						} else {
							listOf()
						}.distinctBy { it.generates ?: it.tag }.sortedBy { it.tag }

						out.println("// generated by HtmlDslGenerator.kt")
						out.println("""""")
						out.println("""open class ${el.tag.toUpperCase()}(""")

						val initParams = mutableListOf<String>()
						attributes.forEach { attribute ->
							initParams.add("""\t${attribute.generates ?: attribute.tag}: String? = null""")
						}

						initParams.add("""\ttagName: String = "${el.tag}"""")
						initParams.add("""\tresources: MutableList<Resource> = mutableListOf()""")
						initParams.add("""\tselfClosing: Boolean = ${el.selfClosing}""")

						if (!el.selfClosing) {
							initParams.add("""\tinit: (${el.tag.toUpperCase()}.() -> Unit)? = null""")
						}
						initParams.forEachIndexed { index, line ->
							if (index == initParams.size - 1) {
								out.println(line.trimIndent().makeTabs())
							} else {
								out.println("$line,".trimIndent().makeTabs())
							}
						}

						out.println(""") : Tag(""".trimMargin().makeTabs())
						out.println("""\ttagName = tagName,""".trimMargin().makeTabs())
						out.println("""\tselfClosing = selfClosing""".trimMargin().makeTabs())
						out.println(""") {""".trimMargin().makeTabs())

						out.println("")

						// add attributes to file
						if (attributes.isNotEmpty()) {
							attributes.forEach { attribute ->
								out.println("""
									\tvar ${attribute.generates ?: attribute.tag}: String?
									\t\tget() = attributes.get("${attribute.tag}")
									\t\tset(value) {
									\t\t\tvalue?.let {
									\t\t\t\tattributes["${attribute.tag}"] = it
									\t\t\t}
									\t\t}
								""".trimIndent().makeTabs())

								out.println("""""")
							}
						}

						// generate init block
						out.println("""\tinit {""".trimIndent().makeTabs())
						attributes.forEach { attribute ->
							out.println("""
								\t\tthis.${attribute.generates ?: attribute.tag} = ${attribute.generates ?: attribute.tag}
							""".trimIndent().makeTabs())
						}

						if (!el.selfClosing) {
							out.println("""""")
							out.println("""\t\tinit?.invoke(this)""".trimIndent().makeTabs())
						}
						out.println("""\t}""".trimIndent().makeTabs())
						out.println("")

						// add functions to file
						if (children.isNotEmpty()) {
							children.forEach { child ->

								out.println("""
									\tfun ${child.generates ?: child.tag}(
								""".trimIndent().replace("""\t""", "\t"))

								val childParams = mutableListOf<String>()
								val childAttributes =
									child.attributes.distinctBy { it.generates ?: it.tag }.
									filter { !it.deprecated }.
									filter{ it.standardized }.
									filter{ !it.experimental }.
									filter{ it.implemented }.
									sortedBy { it.tag }

								childAttributes.forEach { attribute ->
									childParams.add("""
										\t\t${attribute.generates ?: attribute.tag}: String? = null
									""".trimIndent())
								}

								if (!child.selfClosing) {
									childParams.add("""
										\t\tinit: (${child.tag.toUpperCase()}.() -> Unit)? = null
									""".trimIndent())
								}

								childParams.forEachIndexed { index, line ->
									if (index == childParams.size - 1) {
										out.println(line.makeTabs())
									} else {
										out.println(line.makeTabs() + ",")
									}
								}

								out.println("""\t) = ${child.tag.toUpperCase()}().let {""".makeTabs())
								out.println("""\t""".makeTabs())
								out.println("""\t\tthis.children.add(it)""".makeTabs())
								out.println("""\t""".makeTabs())

								childAttributes.forEach { attribute ->
									out.println("""\t\tit.${attribute.generates ?: attribute.tag} = ${attribute.generates ?: attribute.tag}""".makeTabs())

								}

								out.println("""\t""".makeTabs())
								if (!child.selfClosing) {
									out.println("""\t\tinit?.invoke(it)""".makeTabs())
								}
								out.println("""\t\tit""".makeTabs())
								out.println("""\t}""".makeTabs())
								out.println("")

							}

						}

						if (!el.selfClosing) {
							out.println("""
								\toperator fun String.unaryPlus() {
								\t\tchildren.add(Text(this))
								\t}
							""".trimIndent().makeTabs())
							out.println("")
						}

						out.println("}")

					}


				}

				println(elements.size)


			}


		}
	}

}

