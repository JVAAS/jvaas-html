package io.jvaas.dsl.html

interface Element {
	fun render(builder: StringBuilder, indent: String)
}

interface Resource {

}

class Text(val text: String): Element {
	override fun render(builder: StringBuilder, indent: String) {
		builder.append("$indent$text\n")
	}
}

@DslMarker
annotation class TagMarker

@TagMarker
abstract class Tag(
	val tagName: String,
	val selfClosing: Boolean = false,
	var resources: MutableList<Resource>? = null
): Element {

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
		for ((attr, value) in attributes.toList().sortedBy { it.first }) {
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



