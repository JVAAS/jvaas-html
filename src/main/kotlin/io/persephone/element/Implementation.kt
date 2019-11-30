package io.persephone.element

fun html(init: HTML.() -> Unit): HTML {
	val html = HTML()
	html.init()
	return html
}

//fun div(init: DIV.() -> Unit): DIV {
//	val div = DIV()
//	div.init()
//	return div
//}
//
//fun span(init: SPAN.() -> Unit): SPAN {
//	val span = SPAN()
//	span.init()
//	return span
//}