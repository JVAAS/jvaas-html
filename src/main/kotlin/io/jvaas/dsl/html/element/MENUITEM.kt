package io.jvaas.dsl.html.element

import io.jvaas.dsl.html.*
import io.jvaas.dsl.html.attribute.*
import io.jvaas.dsl.html.funtribute.*

// generated by HtmlDslGenerator.kt

open class MENUITEM(
	accesskey: String? = null,
	autocapitalize: String? = null,
	checked: String? = null,
	classes: String? = null,
	command: String? = null,
	contenteditable: String? = null,
	default: String? = null,
	dir: String? = null,
	disabled: String? = null,
	draggable: String? = null,
	hidden: String? = null,
	icon: String? = null,
	id: String? = null,
	inputmode: String? = null,
	`is`: String? = null,
	itemid: String? = null,
	itemprop: String? = null,
	itemref: String? = null,
	itemscope: String? = null,
	itemtype: String? = null,
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
	radiogroup: String? = null,
	slot: String? = null,
	style: String? = null,
	tabindex: String? = null,
	title: String? = null,
	type: String? = null,
	tagName: String = "menuitem",
	selfClosing: Boolean = false,
	init: (MENUITEM.() -> Unit)? = null
) : AttrAccesskey,  
	AttrAutocapitalize,  
	AttrChecked,  
	AttrClasses,  
	AttrCommand,  
	AttrConTenteditable,  
	AttrDefault,  
	AttrDir,  
	AttrDisabled,  
	AttrDraggable,  
	AttrHidden,  
	AttrIcon,  
	AttrId,  
	AttrInputmode,  
	AttrIs,  
	AttrItemid,  
	AttrItemprop,  
	AttrItemref,  
	AttrItemscope,  
	AttrItemtype,  
	AttrLabel,  
	AttrLang,  
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
	AttrRadiogroup,  
	AttrSlot,  
	AttrStyle,  
	AttrTabindex,  
	AttrTitle,  
	AttrType,  
	Tag( 
	tagName = tagName,
	selfClosing = selfClosing, 
) {

	init {
		this.accesskey = accesskey
		this.autocapitalize = autocapitalize
		this.checked = checked
		this.classes = classes
		this.command = command
		this.contenteditable = contenteditable
		this.default = default
		this.dir = dir
		this.disabled = disabled
		this.draggable = draggable
		this.hidden = hidden
		this.icon = icon
		this.id = id
		this.inputmode = inputmode
		this.`is` = `is`
		this.itemid = itemid
		this.itemprop = itemprop
		this.itemref = itemref
		this.itemscope = itemscope
		this.itemtype = itemtype
		this.label = label
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
		this.radiogroup = radiogroup
		this.slot = slot
		this.style = style
		this.tabindex = tabindex
		this.title = title
		this.type = type

		init?.invoke(this)
	}
}
