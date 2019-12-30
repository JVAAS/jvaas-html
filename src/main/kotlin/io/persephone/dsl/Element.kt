package io.persephone.dsl

interface Element {
	fun render(builder: StringBuilder, indent: String)
}

class Text(val text: String): Element {
	override fun render(builder: StringBuilder, indent: String) {
		builder.append("$indent$text\n")
	}
}

abstract class Tag(val tagName: String, var selfClosing: Boolean = false): Element {

	val children = arrayListOf<Element>()
	val attributes = hashMapOf<String, String>()

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
			if (attr == "classes") {
				builder.append(" class=\"$value\"")
			} else if (attr == "styles") {
				builder.append(" style=\"$value\"")
			} else {
				builder.append(" $attr=\"$value\"")
			}
		}
		return builder.toString()
	}

	override fun toString(): String {
		val builder = StringBuilder()
		render(builder, "")
		return builder.toString().trimEnd()
	}
}



