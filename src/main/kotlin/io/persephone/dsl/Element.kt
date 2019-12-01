package io.persephone.dsl

interface Element {
	fun render(builder: StringBuilder, indent: String)
}

class TextElement(val text: String) : Element {
	override fun render(builder: StringBuilder, indent: String) {
		builder.append("$indent$text\n")
	}
}

@DslMarker
annotation class HtmlTagMarker

@HtmlTagMarker
abstract class Tag(val tagName: String, var selfClosing: Boolean = false) : Element {
	val children = arrayListOf<Element>()
	val attributes = hashMapOf<String, String>()

	fun <T : Element> initTag(tag: T): T {
		children.add(tag)
		return tag
	}

	fun <T : Element> initTag(tag: T, init: (T.() -> Unit)? = null): T {
		init?.let {
			tag.init()
		}
		children.add(tag)
		return tag
	}

	override fun render(builder: StringBuilder, indent: String) {
		if (selfClosing) {
			builder.append("$indent<$tagName${renderAttributes()} />\n")
		} else {
			builder.append("$indent<$tagName${renderAttributes()}>\n")
			for (c in children) {
				c.render(builder, "$indent\t")
			}
			builder.append("$indent</$tagName>\n")
		}
	}

	private fun renderAttributes(): String {
		val builder = StringBuilder()
		for ((attr, value) in attributes) {
			builder.append(" $attr=\"$value\"")
		}
		return builder.toString()
	}

	override fun toString(): String {
		val builder = StringBuilder()
		render(builder, "")
		return builder.toString().trimEnd()
	}
}

abstract class TagWithText(name: String) : Tag(name, selfClosing = false) {
	operator fun String.unaryPlus() {
		children.add(TextElement(this))
	}
}

//abstract class HeadTag(name: String): TagWithText(name) {
//
//}
//
//abstract class BodyTag(name: String) : TagWithText(name) {
//	fun b(init: B.() -> Unit) = initTag(B(), init)
//	fun p(init: P.() -> Unit) = initTag(P(), init)
//	fun h1(init: H1.() -> Unit) = initTag(H1(), init)
//	fun a(href: String, init: A.() -> Unit) {
//		val a = initTag(A(), init)
//		a.href = href
//	}
//
//	fun div(init: DIV.() -> Unit) = initTag(DIV(), init)
//	fun span(init: SPAN.() -> Unit) = initTag(SPAN(), init)
//}






