package io.persephone.dsl.element

import io.persephone.dsl.Tag
import io.persephone.dsl.element.*

// generated by HtmlDslGenerator.kt
class HEAD(
	init: (HEAD.() -> Unit)? = null
) : Tag(
	tagName = "head",
	selfClosing = false
) {

	init {
	}

	fun base(
		href: String? = null,
		target: String? = null
	) = initTag(BASE.()).apply {
		this.href = href
		this.target = target
	}

	fun link(
		href: String? = null,
		rel: String? = null,
		type: String? = null
	) = initTag(LINK.()).apply {
		this.href = href
		this.rel = rel
		this.type = type
	}

	fun meta(
		charset: String? = null,
		content: String? = null,
		name: String? = null
	) = initTag(META.()).apply {
		this.charset = charset
		this.content = content
		this.name = name
	}

	fun noscript(
		accesskey: String? = null,
		autocapitalize: String? = null,
		classes: String? = null,
		contenteditable: String? = null,
		dir: String? = null,
		draggable: String? = null,
		hidden: String? = null,
		id: String? = null,
		inputmode: String? = null,
		`is`: String? = null,
		itemid: String? = null,
		itemprop: String? = null,
		itemref: String? = null,
		itemscope: String? = null,
		itemtype: String? = null,
		lang: String? = null,
		onabort: String? = null,
		onautocomplete: String? = null,
		onautocompleteerror: String? = null,
		onblur: String? = null,
		oncancel: String? = null,
		oncanplay: String? = null,
		oncanplaythrough: String? = null,
		onchange: String? = null,
		onclick: String? = null,
		onclose: String? = null,
		oncontextmenu: String? = null,
		oncuechange: String? = null,
		ondblclick: String? = null,
		ondrag: String? = null,
		ondragend: String? = null,
		ondragenter: String? = null,
		ondragexit: String? = null,
		ondragleave: String? = null,
		ondragover: String? = null,
		ondragstart: String? = null,
		ondrop: String? = null,
		ondurationchange: String? = null,
		onemptied: String? = null,
		onended: String? = null,
		onerror: String? = null,
		onfocus: String? = null,
		oninput: String? = null,
		oninvalid: String? = null,
		onkeydown: String? = null,
		onkeypress: String? = null,
		onkeyup: String? = null,
		onload: String? = null,
		onloadeddata: String? = null,
		onloadedmetadata: String? = null,
		onloadstart: String? = null,
		onmousedown: String? = null,
		onmouseenter: String? = null,
		onmouseleave: String? = null,
		onmousemove: String? = null,
		onmouseout: String? = null,
		onmouseover: String? = null,
		onmouseup: String? = null,
		onmousewheel: String? = null,
		onpause: String? = null,
		onplay: String? = null,
		onplaying: String? = null,
		onprogress: String? = null,
		onratechange: String? = null,
		onreset: String? = null,
		onresize: String? = null,
		onscroll: String? = null,
		onseeked: String? = null,
		onseeking: String? = null,
		onselect: String? = null,
		onshow: String? = null,
		onsort: String? = null,
		onstalled: String? = null,
		onsubmit: String? = null,
		onsuspend: String? = null,
		ontimeupdate: String? = null,
		ontoggle: String? = null,
		onvolumechange: String? = null,
		onwaiting: String? = null,
		part: String? = null,
		slot: String? = null,
		style: String? = null,
		tabindex: String? = null,
		title: String? = null,
		init: (NOSCRIPT.() -> Unit)? = null
	) = initTag(NOSCRIPT.(), init).apply {
		this.accesskey = accesskey
		this.autocapitalize = autocapitalize
		this.classes = classes
		this.contenteditable = contenteditable
		this.dir = dir
		this.draggable = draggable
		this.hidden = hidden
		this.id = id
		this.inputmode = inputmode
		this.`is` = `is`
		this.itemid = itemid
		this.itemprop = itemprop
		this.itemref = itemref
		this.itemscope = itemscope
		this.itemtype = itemtype
		this.lang = lang
		this.onabort = onabort
		this.onautocomplete = onautocomplete
		this.onautocompleteerror = onautocompleteerror
		this.onblur = onblur
		this.oncancel = oncancel
		this.oncanplay = oncanplay
		this.oncanplaythrough = oncanplaythrough
		this.onchange = onchange
		this.onclick = onclick
		this.onclose = onclose
		this.oncontextmenu = oncontextmenu
		this.oncuechange = oncuechange
		this.ondblclick = ondblclick
		this.ondrag = ondrag
		this.ondragend = ondragend
		this.ondragenter = ondragenter
		this.ondragexit = ondragexit
		this.ondragleave = ondragleave
		this.ondragover = ondragover
		this.ondragstart = ondragstart
		this.ondrop = ondrop
		this.ondurationchange = ondurationchange
		this.onemptied = onemptied
		this.onended = onended
		this.onerror = onerror
		this.onfocus = onfocus
		this.oninput = oninput
		this.oninvalid = oninvalid
		this.onkeydown = onkeydown
		this.onkeypress = onkeypress
		this.onkeyup = onkeyup
		this.onload = onload
		this.onloadeddata = onloadeddata
		this.onloadedmetadata = onloadedmetadata
		this.onloadstart = onloadstart
		this.onmousedown = onmousedown
		this.onmouseenter = onmouseenter
		this.onmouseleave = onmouseleave
		this.onmousemove = onmousemove
		this.onmouseout = onmouseout
		this.onmouseover = onmouseover
		this.onmouseup = onmouseup
		this.onmousewheel = onmousewheel
		this.onpause = onpause
		this.onplay = onplay
		this.onplaying = onplaying
		this.onprogress = onprogress
		this.onratechange = onratechange
		this.onreset = onreset
		this.onresize = onresize
		this.onscroll = onscroll
		this.onseeked = onseeked
		this.onseeking = onseeking
		this.onselect = onselect
		this.onshow = onshow
		this.onsort = onsort
		this.onstalled = onstalled
		this.onsubmit = onsubmit
		this.onsuspend = onsuspend
		this.ontimeupdate = ontimeupdate
		this.ontoggle = ontoggle
		this.onvolumechange = onvolumechange
		this.onwaiting = onwaiting
		this.part = part
		this.slot = slot
		this.style = style
		this.tabindex = tabindex
		this.title = title
	}

	fun script(
		accesskey: String? = null,
		async: String? = null,
		autocapitalize: String? = null,
		classes: String? = null,
		contenteditable: String? = null,
		crossorigin: String? = null,
		defer: String? = null,
		dir: String? = null,
		draggable: String? = null,
		hidden: String? = null,
		id: String? = null,
		inputmode: String? = null,
		integrity: String? = null,
		`is`: String? = null,
		itemid: String? = null,
		itemprop: String? = null,
		itemref: String? = null,
		itemscope: String? = null,
		itemtype: String? = null,
		lang: String? = null,
		nomodule: String? = null,
		nonce: String? = null,
		onabort: String? = null,
		onautocomplete: String? = null,
		onautocompleteerror: String? = null,
		onblur: String? = null,
		oncancel: String? = null,
		oncanplay: String? = null,
		oncanplaythrough: String? = null,
		onchange: String? = null,
		onclick: String? = null,
		onclose: String? = null,
		oncontextmenu: String? = null,
		oncuechange: String? = null,
		ondblclick: String? = null,
		ondrag: String? = null,
		ondragend: String? = null,
		ondragenter: String? = null,
		ondragexit: String? = null,
		ondragleave: String? = null,
		ondragover: String? = null,
		ondragstart: String? = null,
		ondrop: String? = null,
		ondurationchange: String? = null,
		onemptied: String? = null,
		onended: String? = null,
		onerror: String? = null,
		onfocus: String? = null,
		oninput: String? = null,
		oninvalid: String? = null,
		onkeydown: String? = null,
		onkeypress: String? = null,
		onkeyup: String? = null,
		onload: String? = null,
		onloadeddata: String? = null,
		onloadedmetadata: String? = null,
		onloadstart: String? = null,
		onmousedown: String? = null,
		onmouseenter: String? = null,
		onmouseleave: String? = null,
		onmousemove: String? = null,
		onmouseout: String? = null,
		onmouseover: String? = null,
		onmouseup: String? = null,
		onmousewheel: String? = null,
		onpause: String? = null,
		onplay: String? = null,
		onplaying: String? = null,
		onprogress: String? = null,
		onratechange: String? = null,
		onreset: String? = null,
		onresize: String? = null,
		onscroll: String? = null,
		onseeked: String? = null,
		onseeking: String? = null,
		onselect: String? = null,
		onshow: String? = null,
		onsort: String? = null,
		onstalled: String? = null,
		onsubmit: String? = null,
		onsuspend: String? = null,
		ontimeupdate: String? = null,
		ontoggle: String? = null,
		onvolumechange: String? = null,
		onwaiting: String? = null,
		part: String? = null,
		referrerpolicy: String? = null,
		slot: String? = null,
		src: String? = null,
		style: String? = null,
		tabindex: String? = null,
		title: String? = null,
		type: String? = null,
		init: (SCRIPT.() -> Unit)? = null
	) = initTag(SCRIPT.(), init).apply {
		this.accesskey = accesskey
		this.async = async
		this.autocapitalize = autocapitalize
		this.classes = classes
		this.contenteditable = contenteditable
		this.crossorigin = crossorigin
		this.defer = defer
		this.dir = dir
		this.draggable = draggable
		this.hidden = hidden
		this.id = id
		this.inputmode = inputmode
		this.integrity = integrity
		this.`is` = `is`
		this.itemid = itemid
		this.itemprop = itemprop
		this.itemref = itemref
		this.itemscope = itemscope
		this.itemtype = itemtype
		this.lang = lang
		this.nomodule = nomodule
		this.nonce = nonce
		this.onabort = onabort
		this.onautocomplete = onautocomplete
		this.onautocompleteerror = onautocompleteerror
		this.onblur = onblur
		this.oncancel = oncancel
		this.oncanplay = oncanplay
		this.oncanplaythrough = oncanplaythrough
		this.onchange = onchange
		this.onclick = onclick
		this.onclose = onclose
		this.oncontextmenu = oncontextmenu
		this.oncuechange = oncuechange
		this.ondblclick = ondblclick
		this.ondrag = ondrag
		this.ondragend = ondragend
		this.ondragenter = ondragenter
		this.ondragexit = ondragexit
		this.ondragleave = ondragleave
		this.ondragover = ondragover
		this.ondragstart = ondragstart
		this.ondrop = ondrop
		this.ondurationchange = ondurationchange
		this.onemptied = onemptied
		this.onended = onended
		this.onerror = onerror
		this.onfocus = onfocus
		this.oninput = oninput
		this.oninvalid = oninvalid
		this.onkeydown = onkeydown
		this.onkeypress = onkeypress
		this.onkeyup = onkeyup
		this.onload = onload
		this.onloadeddata = onloadeddata
		this.onloadedmetadata = onloadedmetadata
		this.onloadstart = onloadstart
		this.onmousedown = onmousedown
		this.onmouseenter = onmouseenter
		this.onmouseleave = onmouseleave
		this.onmousemove = onmousemove
		this.onmouseout = onmouseout
		this.onmouseover = onmouseover
		this.onmouseup = onmouseup
		this.onmousewheel = onmousewheel
		this.onpause = onpause
		this.onplay = onplay
		this.onplaying = onplaying
		this.onprogress = onprogress
		this.onratechange = onratechange
		this.onreset = onreset
		this.onresize = onresize
		this.onscroll = onscroll
		this.onseeked = onseeked
		this.onseeking = onseeking
		this.onselect = onselect
		this.onshow = onshow
		this.onsort = onsort
		this.onstalled = onstalled
		this.onsubmit = onsubmit
		this.onsuspend = onsuspend
		this.ontimeupdate = ontimeupdate
		this.ontoggle = ontoggle
		this.onvolumechange = onvolumechange
		this.onwaiting = onwaiting
		this.part = part
		this.referrerpolicy = referrerpolicy
		this.slot = slot
		this.src = src
		this.style = style
		this.tabindex = tabindex
		this.title = title
		this.type = type
	}

	fun style(
		media: String? = null,
		nonce: String? = null,
		title: String? = null,
		type: String? = null,
		init: (STYLE.() -> Unit)? = null
	) = initTag(STYLE.(), init).apply {
		this.media = media
		this.nonce = nonce
		this.title = title
		this.type = type
	}

	fun title(
		init: (TITLE.() -> Unit)? = null
	) = initTag(TITLE.(), init).apply {
	}

}
