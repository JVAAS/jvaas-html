package io.persephone.dsl.helper

class Grouping(

	tag: String,
	attributes: List<String> = listOf(),
	init: (Grouping.() -> Unit)? = null

): Element(
	tag = tag,
	selfClosing = false,
	attributes = attributes
) {

	var children: MutableList<Element> = mutableListOf()

	init {
		init?.invoke(this)
	}

	fun grouping(
		tag: String,
		attributes: List<String> = listOf(),
		children: MutableList<Element>? = null,
		init: (Grouping.() -> Unit)? = null
	) {
		val newGroup = Grouping(
			tag = tag,
			attributes = attributes,
			init = null
		)
		if (children != null) {
			newGroup.children = children
		}
		this.children.add(newGroup)

		init?.invoke(newGroup)
	}

	fun element(
		tag: String,
		attributes: List<String> = listOf()
	) {

		println("element(tag=$tag)")

		this.children.add(Element(
			tag = tag,
			attributes = attributes
		))
	}

	fun generate(): Grouping {

		println(tag)
		children.forEach {
			println("    ${it.tag}")
		}

		return this

	}

}