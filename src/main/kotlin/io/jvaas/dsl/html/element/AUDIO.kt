package io.jvaas.dsl.html.element

import io.jvaas.dsl.html.*

// generated by HtmlDslGenerator.kt

open class AUDIO(
	accesskey: String? = null,
	audioprocess: String? = null,
	autocapitalize: String? = null,
	autoplay: String? = null,
	canplay: String? = null,
	canplaythrough: String? = null,
	classes: String? = null,
	complete: String? = null,
	contenteditable: String? = null,
	controls: String? = null,
	crossorigin: String? = null,
	currentTime: String? = null,
	dir: String? = null,
	draggable: String? = null,
	duration: String? = null,
	durationchange: String? = null,
	emptied: String? = null,
	ended: String? = null,
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
	loadeddata: String? = null,
	loadedmetadata: String? = null,
	loop: String? = null,
	muted: String? = null,
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
	pause: String? = null,
	play: String? = null,
	playing: String? = null,
	preload: String? = null,
	ratechange: String? = null,
	seeked: String? = null,
	seeking: String? = null,
	slot: String? = null,
	src: String? = null,
	stalled: String? = null,
	style: String? = null,
	suspend: String? = null,
	tabindex: String? = null,
	timeupdate: String? = null,
	title: String? = null,
	volumechange: String? = null,
	waiting: String? = null,
	tagName: String = "audio",
	selfClosing: Boolean = false,
	init: (AUDIO.() -> Unit)? = null
) : Tag(
	tagName = tagName,
	selfClosing = selfClosing
) {

	var accesskey: String?
		get() = attributes.get("accesskey")
		set(value) {
			value?.let {
				attributes["accesskey"] = it
			}
		}

	var audioprocess: String?
		get() = attributes.get("audioprocess")
		set(value) {
			value?.let {
				attributes["audioprocess"] = it
			}
		}

	var autocapitalize: String?
		get() = attributes.get("autocapitalize")
		set(value) {
			value?.let {
				attributes["autocapitalize"] = it
			}
		}

	var autoplay: String?
		get() = attributes.get("autoplay")
		set(value) {
			value?.let {
				attributes["autoplay"] = it
			}
		}

	var canplay: String?
		get() = attributes.get("canplay")
		set(value) {
			value?.let {
				attributes["canplay"] = it
			}
		}

	var canplaythrough: String?
		get() = attributes.get("canplaythrough")
		set(value) {
			value?.let {
				attributes["canplaythrough"] = it
			}
		}

	var classes: String?
		get() = attributes.get("class")
		set(value) {
			value?.let {
				attributes["class"] = it
			}
		}

	var complete: String?
		get() = attributes.get("complete")
		set(value) {
			value?.let {
				attributes["complete"] = it
			}
		}

	var contenteditable: String?
		get() = attributes.get("contenteditable")
		set(value) {
			value?.let {
				attributes["contenteditable"] = it
			}
		}

	var controls: String?
		get() = attributes.get("controls")
		set(value) {
			value?.let {
				attributes["controls"] = it
			}
		}

	var crossorigin: String?
		get() = attributes.get("crossorigin")
		set(value) {
			value?.let {
				attributes["crossorigin"] = it
			}
		}

	var currentTime: String?
		get() = attributes.get("currentTime")
		set(value) {
			value?.let {
				attributes["currentTime"] = it
			}
		}

	var dir: String?
		get() = attributes.get("dir")
		set(value) {
			value?.let {
				attributes["dir"] = it
			}
		}

	var draggable: String?
		get() = attributes.get("draggable")
		set(value) {
			value?.let {
				attributes["draggable"] = it
			}
		}

	var duration: String?
		get() = attributes.get("duration")
		set(value) {
			value?.let {
				attributes["duration"] = it
			}
		}

	var durationchange: String?
		get() = attributes.get("durationchange")
		set(value) {
			value?.let {
				attributes["durationchange"] = it
			}
		}

	var emptied: String?
		get() = attributes.get("emptied")
		set(value) {
			value?.let {
				attributes["emptied"] = it
			}
		}

	var ended: String?
		get() = attributes.get("ended")
		set(value) {
			value?.let {
				attributes["ended"] = it
			}
		}

	var hidden: String?
		get() = attributes.get("hidden")
		set(value) {
			value?.let {
				attributes["hidden"] = it
			}
		}

	var id: String?
		get() = attributes.get("id")
		set(value) {
			value?.let {
				attributes["id"] = it
			}
		}

	var inputmode: String?
		get() = attributes.get("inputmode")
		set(value) {
			value?.let {
				attributes["inputmode"] = it
			}
		}

	var `is`: String?
		get() = attributes.get("is")
		set(value) {
			value?.let {
				attributes["is"] = it
			}
		}

	var itemid: String?
		get() = attributes.get("itemid")
		set(value) {
			value?.let {
				attributes["itemid"] = it
			}
		}

	var itemprop: String?
		get() = attributes.get("itemprop")
		set(value) {
			value?.let {
				attributes["itemprop"] = it
			}
		}

	var itemref: String?
		get() = attributes.get("itemref")
		set(value) {
			value?.let {
				attributes["itemref"] = it
			}
		}

	var itemscope: String?
		get() = attributes.get("itemscope")
		set(value) {
			value?.let {
				attributes["itemscope"] = it
			}
		}

	var itemtype: String?
		get() = attributes.get("itemtype")
		set(value) {
			value?.let {
				attributes["itemtype"] = it
			}
		}

	var lang: String?
		get() = attributes.get("lang")
		set(value) {
			value?.let {
				attributes["lang"] = it
			}
		}

	var loadeddata: String?
		get() = attributes.get("loadeddata")
		set(value) {
			value?.let {
				attributes["loadeddata"] = it
			}
		}

	var loadedmetadata: String?
		get() = attributes.get("loadedmetadata")
		set(value) {
			value?.let {
				attributes["loadedmetadata"] = it
			}
		}

	var loop: String?
		get() = attributes.get("loop")
		set(value) {
			value?.let {
				attributes["loop"] = it
			}
		}

	var muted: String?
		get() = attributes.get("muted")
		set(value) {
			value?.let {
				attributes["muted"] = it
			}
		}

	var onabort: String?
		get() = attributes.get("onabort")
		set(value) {
			value?.let {
				attributes["onabort"] = it
			}
		}

	var onautocomplete: String?
		get() = attributes.get("onautocomplete")
		set(value) {
			value?.let {
				attributes["onautocomplete"] = it
			}
		}

	var onautocompleteerror: String?
		get() = attributes.get("onautocompleteerror")
		set(value) {
			value?.let {
				attributes["onautocompleteerror"] = it
			}
		}

	var onblur: String?
		get() = attributes.get("onblur")
		set(value) {
			value?.let {
				attributes["onblur"] = it
			}
		}

	var oncancel: String?
		get() = attributes.get("oncancel")
		set(value) {
			value?.let {
				attributes["oncancel"] = it
			}
		}

	var oncanplay: String?
		get() = attributes.get("oncanplay")
		set(value) {
			value?.let {
				attributes["oncanplay"] = it
			}
		}

	var oncanplaythrough: String?
		get() = attributes.get("oncanplaythrough")
		set(value) {
			value?.let {
				attributes["oncanplaythrough"] = it
			}
		}

	var onchange: String?
		get() = attributes.get("onchange")
		set(value) {
			value?.let {
				attributes["onchange"] = it
			}
		}

	var onclick: String?
		get() = attributes.get("onclick")
		set(value) {
			value?.let {
				attributes["onclick"] = it
			}
		}

	var onclose: String?
		get() = attributes.get("onclose")
		set(value) {
			value?.let {
				attributes["onclose"] = it
			}
		}

	var oncontextmenu: String?
		get() = attributes.get("oncontextmenu")
		set(value) {
			value?.let {
				attributes["oncontextmenu"] = it
			}
		}

	var oncuechange: String?
		get() = attributes.get("oncuechange")
		set(value) {
			value?.let {
				attributes["oncuechange"] = it
			}
		}

	var ondblclick: String?
		get() = attributes.get("ondblclick")
		set(value) {
			value?.let {
				attributes["ondblclick"] = it
			}
		}

	var ondrag: String?
		get() = attributes.get("ondrag")
		set(value) {
			value?.let {
				attributes["ondrag"] = it
			}
		}

	var ondragend: String?
		get() = attributes.get("ondragend")
		set(value) {
			value?.let {
				attributes["ondragend"] = it
			}
		}

	var ondragenter: String?
		get() = attributes.get("ondragenter")
		set(value) {
			value?.let {
				attributes["ondragenter"] = it
			}
		}

	var ondragexit: String?
		get() = attributes.get("ondragexit")
		set(value) {
			value?.let {
				attributes["ondragexit"] = it
			}
		}

	var ondragleave: String?
		get() = attributes.get("ondragleave")
		set(value) {
			value?.let {
				attributes["ondragleave"] = it
			}
		}

	var ondragover: String?
		get() = attributes.get("ondragover")
		set(value) {
			value?.let {
				attributes["ondragover"] = it
			}
		}

	var ondragstart: String?
		get() = attributes.get("ondragstart")
		set(value) {
			value?.let {
				attributes["ondragstart"] = it
			}
		}

	var ondrop: String?
		get() = attributes.get("ondrop")
		set(value) {
			value?.let {
				attributes["ondrop"] = it
			}
		}

	var ondurationchange: String?
		get() = attributes.get("ondurationchange")
		set(value) {
			value?.let {
				attributes["ondurationchange"] = it
			}
		}

	var onemptied: String?
		get() = attributes.get("onemptied")
		set(value) {
			value?.let {
				attributes["onemptied"] = it
			}
		}

	var onended: String?
		get() = attributes.get("onended")
		set(value) {
			value?.let {
				attributes["onended"] = it
			}
		}

	var onerror: String?
		get() = attributes.get("onerror")
		set(value) {
			value?.let {
				attributes["onerror"] = it
			}
		}

	var onfocus: String?
		get() = attributes.get("onfocus")
		set(value) {
			value?.let {
				attributes["onfocus"] = it
			}
		}

	var oninput: String?
		get() = attributes.get("oninput")
		set(value) {
			value?.let {
				attributes["oninput"] = it
			}
		}

	var oninvalid: String?
		get() = attributes.get("oninvalid")
		set(value) {
			value?.let {
				attributes["oninvalid"] = it
			}
		}

	var onkeydown: String?
		get() = attributes.get("onkeydown")
		set(value) {
			value?.let {
				attributes["onkeydown"] = it
			}
		}

	var onkeypress: String?
		get() = attributes.get("onkeypress")
		set(value) {
			value?.let {
				attributes["onkeypress"] = it
			}
		}

	var onkeyup: String?
		get() = attributes.get("onkeyup")
		set(value) {
			value?.let {
				attributes["onkeyup"] = it
			}
		}

	var onload: String?
		get() = attributes.get("onload")
		set(value) {
			value?.let {
				attributes["onload"] = it
			}
		}

	var onloadeddata: String?
		get() = attributes.get("onloadeddata")
		set(value) {
			value?.let {
				attributes["onloadeddata"] = it
			}
		}

	var onloadedmetadata: String?
		get() = attributes.get("onloadedmetadata")
		set(value) {
			value?.let {
				attributes["onloadedmetadata"] = it
			}
		}

	var onloadstart: String?
		get() = attributes.get("onloadstart")
		set(value) {
			value?.let {
				attributes["onloadstart"] = it
			}
		}

	var onmousedown: String?
		get() = attributes.get("onmousedown")
		set(value) {
			value?.let {
				attributes["onmousedown"] = it
			}
		}

	var onmouseenter: String?
		get() = attributes.get("onmouseenter")
		set(value) {
			value?.let {
				attributes["onmouseenter"] = it
			}
		}

	var onmouseleave: String?
		get() = attributes.get("onmouseleave")
		set(value) {
			value?.let {
				attributes["onmouseleave"] = it
			}
		}

	var onmousemove: String?
		get() = attributes.get("onmousemove")
		set(value) {
			value?.let {
				attributes["onmousemove"] = it
			}
		}

	var onmouseout: String?
		get() = attributes.get("onmouseout")
		set(value) {
			value?.let {
				attributes["onmouseout"] = it
			}
		}

	var onmouseover: String?
		get() = attributes.get("onmouseover")
		set(value) {
			value?.let {
				attributes["onmouseover"] = it
			}
		}

	var onmouseup: String?
		get() = attributes.get("onmouseup")
		set(value) {
			value?.let {
				attributes["onmouseup"] = it
			}
		}

	var onmousewheel: String?
		get() = attributes.get("onmousewheel")
		set(value) {
			value?.let {
				attributes["onmousewheel"] = it
			}
		}

	var onpause: String?
		get() = attributes.get("onpause")
		set(value) {
			value?.let {
				attributes["onpause"] = it
			}
		}

	var onplay: String?
		get() = attributes.get("onplay")
		set(value) {
			value?.let {
				attributes["onplay"] = it
			}
		}

	var onplaying: String?
		get() = attributes.get("onplaying")
		set(value) {
			value?.let {
				attributes["onplaying"] = it
			}
		}

	var onprogress: String?
		get() = attributes.get("onprogress")
		set(value) {
			value?.let {
				attributes["onprogress"] = it
			}
		}

	var onratechange: String?
		get() = attributes.get("onratechange")
		set(value) {
			value?.let {
				attributes["onratechange"] = it
			}
		}

	var onreset: String?
		get() = attributes.get("onreset")
		set(value) {
			value?.let {
				attributes["onreset"] = it
			}
		}

	var onresize: String?
		get() = attributes.get("onresize")
		set(value) {
			value?.let {
				attributes["onresize"] = it
			}
		}

	var onscroll: String?
		get() = attributes.get("onscroll")
		set(value) {
			value?.let {
				attributes["onscroll"] = it
			}
		}

	var onseeked: String?
		get() = attributes.get("onseeked")
		set(value) {
			value?.let {
				attributes["onseeked"] = it
			}
		}

	var onseeking: String?
		get() = attributes.get("onseeking")
		set(value) {
			value?.let {
				attributes["onseeking"] = it
			}
		}

	var onselect: String?
		get() = attributes.get("onselect")
		set(value) {
			value?.let {
				attributes["onselect"] = it
			}
		}

	var onshow: String?
		get() = attributes.get("onshow")
		set(value) {
			value?.let {
				attributes["onshow"] = it
			}
		}

	var onsort: String?
		get() = attributes.get("onsort")
		set(value) {
			value?.let {
				attributes["onsort"] = it
			}
		}

	var onstalled: String?
		get() = attributes.get("onstalled")
		set(value) {
			value?.let {
				attributes["onstalled"] = it
			}
		}

	var onsubmit: String?
		get() = attributes.get("onsubmit")
		set(value) {
			value?.let {
				attributes["onsubmit"] = it
			}
		}

	var onsuspend: String?
		get() = attributes.get("onsuspend")
		set(value) {
			value?.let {
				attributes["onsuspend"] = it
			}
		}

	var ontimeupdate: String?
		get() = attributes.get("ontimeupdate")
		set(value) {
			value?.let {
				attributes["ontimeupdate"] = it
			}
		}

	var ontoggle: String?
		get() = attributes.get("ontoggle")
		set(value) {
			value?.let {
				attributes["ontoggle"] = it
			}
		}

	var onvolumechange: String?
		get() = attributes.get("onvolumechange")
		set(value) {
			value?.let {
				attributes["onvolumechange"] = it
			}
		}

	var onwaiting: String?
		get() = attributes.get("onwaiting")
		set(value) {
			value?.let {
				attributes["onwaiting"] = it
			}
		}

	var part: String?
		get() = attributes.get("part")
		set(value) {
			value?.let {
				attributes["part"] = it
			}
		}

	var pause: String?
		get() = attributes.get("pause")
		set(value) {
			value?.let {
				attributes["pause"] = it
			}
		}

	var play: String?
		get() = attributes.get("play")
		set(value) {
			value?.let {
				attributes["play"] = it
			}
		}

	var playing: String?
		get() = attributes.get("playing")
		set(value) {
			value?.let {
				attributes["playing"] = it
			}
		}

	var preload: String?
		get() = attributes.get("preload")
		set(value) {
			value?.let {
				attributes["preload"] = it
			}
		}

	var ratechange: String?
		get() = attributes.get("ratechange")
		set(value) {
			value?.let {
				attributes["ratechange"] = it
			}
		}

	var seeked: String?
		get() = attributes.get("seeked")
		set(value) {
			value?.let {
				attributes["seeked"] = it
			}
		}

	var seeking: String?
		get() = attributes.get("seeking")
		set(value) {
			value?.let {
				attributes["seeking"] = it
			}
		}

	var slot: String?
		get() = attributes.get("slot")
		set(value) {
			value?.let {
				attributes["slot"] = it
			}
		}

	var src: String?
		get() = attributes.get("src")
		set(value) {
			value?.let {
				attributes["src"] = it
			}
		}

	var stalled: String?
		get() = attributes.get("stalled")
		set(value) {
			value?.let {
				attributes["stalled"] = it
			}
		}

	var style: String?
		get() = attributes.get("style")
		set(value) {
			value?.let {
				attributes["style"] = it
			}
		}

	var suspend: String?
		get() = attributes.get("suspend")
		set(value) {
			value?.let {
				attributes["suspend"] = it
			}
		}

	var tabindex: String?
		get() = attributes.get("tabindex")
		set(value) {
			value?.let {
				attributes["tabindex"] = it
			}
		}

	var timeupdate: String?
		get() = attributes.get("timeupdate")
		set(value) {
			value?.let {
				attributes["timeupdate"] = it
			}
		}

	var title: String?
		get() = attributes.get("title")
		set(value) {
			value?.let {
				attributes["title"] = it
			}
		}

	var volumechange: String?
		get() = attributes.get("volumechange")
		set(value) {
			value?.let {
				attributes["volumechange"] = it
			}
		}

	var waiting: String?
		get() = attributes.get("waiting")
		set(value) {
			value?.let {
				attributes["waiting"] = it
			}
		}

	init {
		this.accesskey = accesskey
		this.audioprocess = audioprocess
		this.autocapitalize = autocapitalize
		this.autoplay = autoplay
		this.canplay = canplay
		this.canplaythrough = canplaythrough
		this.classes = classes
		this.complete = complete
		this.contenteditable = contenteditable
		this.controls = controls
		this.crossorigin = crossorigin
		this.currentTime = currentTime
		this.dir = dir
		this.draggable = draggable
		this.duration = duration
		this.durationchange = durationchange
		this.emptied = emptied
		this.ended = ended
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
		this.loadeddata = loadeddata
		this.loadedmetadata = loadedmetadata
		this.loop = loop
		this.muted = muted
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
		this.pause = pause
		this.play = play
		this.playing = playing
		this.preload = preload
		this.ratechange = ratechange
		this.seeked = seeked
		this.seeking = seeking
		this.slot = slot
		this.src = src
		this.stalled = stalled
		this.style = style
		this.suspend = suspend
		this.tabindex = tabindex
		this.timeupdate = timeupdate
		this.title = title
		this.volumechange = volumechange
		this.waiting = waiting

		init?.invoke(this)
	}

	fun source(
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
		media: String? = null,
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
		sizes: String? = null,
		slot: String? = null,
		src: String? = null,
		srcset: String? = null,
		style: String? = null,
		tabindex: String? = null,
		title: String? = null,
		type: String? = null,
		init: (SOURCE.() -> Unit)? = null
	) = SOURCE().let {
	
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
		it.media = media
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
		it.sizes = sizes
		it.slot = slot
		it.src = src
		it.srcset = srcset
		it.style = style
		it.tabindex = tabindex
		it.title = title
		it.type = type
	
		init?.invoke(it)
		it
	}

	fun track(
		accesskey: String? = null,
		autocapitalize: String? = null,
		classes: String? = null,
		contenteditable: String? = null,
		default: String? = null,
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
		kind: String? = null,
		label: String? = null,
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
		src: String? = null,
		srclang: String? = null,
		style: String? = null,
		tabindex: String? = null,
		title: String? = null
	) = TRACK().let {
	
		this.children.add(it)
	
		it.accesskey = accesskey
		it.autocapitalize = autocapitalize
		it.classes = classes
		it.contenteditable = contenteditable
		it.default = default
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
		it.kind = kind
		it.label = label
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
		it.src = src
		it.srclang = srclang
		it.style = style
		it.tabindex = tabindex
		it.title = title
	
		it
	}

	operator fun String.unaryPlus() {
		children.add(Text(this))
	}

}