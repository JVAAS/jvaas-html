package io.jvaas.dsl.html.element

import io.jvaas.dsl.html.*
import io.jvaas.dsl.html.attribute.*
import io.jvaas.dsl.html.funtribute.*

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
) : AttrAccesskey,  
	AttrAudioprocess,  
	AttrAutocapitalize,  
	AttrAutoplay,  
	AttrCanplay,  
	AttrCanplaythrough,  
	AttrClasses,  
	AttrComplete,  
	AttrConTenteditable,  
	AttrConTrols,  
	AttrCrossorigin,  
	AttrCurrentTime,  
	AttrDir,  
	AttrDraggable,  
	AttrDuration,  
	AttrDurationChange,  
	AttrEmptied,  
	AttrEnded,  
	AttrHidden,  
	AttrId,  
	AttrInputmode,  
	AttrIs,  
	AttrItemid,  
	AttrItemprop,  
	AttrItemref,  
	AttrItemscope,  
	AttrItemtype,  
	AttrLang,  
	AttrLoadeddata,  
	AttrLoadedmetadata,  
	AttrLoop,  
	AttrMuted,  
	AttrOnAbort,  
	AttrOnAutocomplete,  
	AttrOnAutocompleteerror,  
	AttrOnBlur,  
	AttrOnCancel,  
	AttrOnCanplay,  
	AttrOnCanplaythrough,  
	AttrOnChange,  
	AttrOnClick,  
	AttrOnClose,  
	AttrOnContextmenu,  
	AttrOnCuechange,  
	AttrOnDblclick,  
	AttrOnDrag,  
	AttrOnDragend,  
	AttrOnDragenter,  
	AttrOnDragexit,  
	AttrOnDragleave,  
	AttrOnDragover,  
	AttrOnDragstart,  
	AttrOnDrop,  
	AttrOnDurationchange,  
	AttrOnEmptied,  
	AttrOnEnded,  
	AttrOnError,  
	AttrOnFocus,  
	AttrOnInput,  
	AttrOnInvalid,  
	AttrOnKeydown,  
	AttrOnKeypress,  
	AttrOnKeyup,  
	AttrOnLoad,  
	AttrOnLoadeddata,  
	AttrOnLoadedmetadata,  
	AttrOnLoadstart,  
	AttrOnMousedown,  
	AttrOnMouseenter,  
	AttrOnMouseleave,  
	AttrOnMousemove,  
	AttrOnMouseout,  
	AttrOnMouseover,  
	AttrOnMouseup,  
	AttrOnMousewheel,  
	AttrOnPause,  
	AttrOnPlay,  
	AttrOnPlaying,  
	AttrOnProgress,  
	AttrOnRatechange,  
	AttrOnReset,  
	AttrOnResize,  
	AttrOnScroll,  
	AttrOnSeeked,  
	AttrOnSeeking,  
	AttrOnSelect,  
	AttrOnShow,  
	AttrOnSort,  
	AttrOnStalled,  
	AttrOnSubmit,  
	AttrOnSuspend,  
	AttrOnTimeupdate,  
	AttrOnToggle,  
	AttrOnVolumechange,  
	AttrOnWaiting,  
	AttrPart,  
	AttrPause,  
	AttrPlay,  
	AttrPlaying,  
	AttrPreload,  
	AttrRatechange,  
	AttrSeeked,  
	AttrSeeking,  
	AttrSlot,  
	AttrSrc,  
	AttrStalled,  
	AttrStyle,  
	AttrSuspend,  
	AttrTabindex,  
	AttrTimeupdate,  
	AttrTitle,  
	AttrVolumechange,  
	AttrWaiting,  
	FuntSource,  
	FuntTrack,  
	Tag( 
	tagName = tagName,
	selfClosing = selfClosing, 
) {

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
}
