package io.persephone.element

class HTML : TagWithText("html") {
	fun head(init: HEAD.() -> Unit) = initTag(HEAD(), init)
	fun body(init: BODY.() -> Unit) = initTag(BODY(), init)
}

class BODY : BodyTag("body")

class HEAD : TagWithText("head") {
	fun title(init: HeadTitle.() -> Unit) = initTag(HeadTitle(), init)
}

class HeadTitle : TagWithText("title")

//class B : BodyTag("b")
//
//class P : BodyTag("p")
//
//class H1 : BodyTag("h1")
//
//class DIV : BodyTag("div")
//
//class SPAN : BodyTag("span")
//
//class A : BodyTag("a") {
//	var href: String
//		get() = attributes["href"]!!
//		set(value) {
//			attributes["href"] = value
//		}
//}