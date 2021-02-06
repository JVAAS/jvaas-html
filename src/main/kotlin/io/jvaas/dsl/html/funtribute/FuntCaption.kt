package io.jvaas.dsl.html.funtribute

import io.jvaas.dsl.html.element.CAPTION

// generated by HtmlDslGenerator.kt

interface FuntCaption : Funt {

	fun caption(
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
		init: (CAPTION.() -> Unit)? = null
	) = CAPTION().let {
	
		it.resources = this.resources
		this.children.add(it)
	
		it.accesskey = accesskey
		it.autocapitalize = autocapitalize
		it.classes = classes
		it.contenteditable = contenteditable
		it.dir = dir
		it.draggable = draggable
		it.hidden = hidden
		it.id = id
		it.inputmode = inputmode
		it.`is` = `is`
		it.itemid = itemid
		it.itemprop = itemprop
		it.itemref = itemref
		it.itemscope = itemscope
		it.itemtype = itemtype
		it.lang = lang
		it.onabort = onabort
		it.onautocomplete = onautocomplete
		it.onautocompleteerror = onautocompleteerror
		it.onblur = onblur
		it.oncancel = oncancel
		it.oncanplay = oncanplay
		it.oncanplaythrough = oncanplaythrough
		it.onchange = onchange
		it.onclick = onclick
		it.onclose = onclose
		it.oncontextmenu = oncontextmenu
		it.oncuechange = oncuechange
		it.ondblclick = ondblclick
		it.ondrag = ondrag
		it.ondragend = ondragend
		it.ondragenter = ondragenter
		it.ondragexit = ondragexit
		it.ondragleave = ondragleave
		it.ondragover = ondragover
		it.ondragstart = ondragstart
		it.ondrop = ondrop
		it.ondurationchange = ondurationchange
		it.onemptied = onemptied
		it.onended = onended
		it.onerror = onerror
		it.onfocus = onfocus
		it.oninput = oninput
		it.oninvalid = oninvalid
		it.onkeydown = onkeydown
		it.onkeypress = onkeypress
		it.onkeyup = onkeyup
		it.onload = onload
		it.onloadeddata = onloadeddata
		it.onloadedmetadata = onloadedmetadata
		it.onloadstart = onloadstart
		it.onmousedown = onmousedown
		it.onmouseenter = onmouseenter
		it.onmouseleave = onmouseleave
		it.onmousemove = onmousemove
		it.onmouseout = onmouseout
		it.onmouseover = onmouseover
		it.onmouseup = onmouseup
		it.onmousewheel = onmousewheel
		it.onpause = onpause
		it.onplay = onplay
		it.onplaying = onplaying
		it.onprogress = onprogress
		it.onratechange = onratechange
		it.onreset = onreset
		it.onresize = onresize
		it.onscroll = onscroll
		it.onseeked = onseeked
		it.onseeking = onseeking
		it.onselect = onselect
		it.onshow = onshow
		it.onsort = onsort
		it.onstalled = onstalled
		it.onsubmit = onsubmit
		it.onsuspend = onsuspend
		it.ontimeupdate = ontimeupdate
		it.ontoggle = ontoggle
		it.onvolumechange = onvolumechange
		it.onwaiting = onwaiting
		it.part = part
		it.slot = slot
		it.style = style
		it.tabindex = tabindex
		it.title = title
	
		init?.invoke(it)
		it
	}

}
