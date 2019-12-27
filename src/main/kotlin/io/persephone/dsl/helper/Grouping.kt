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
	): Grouping {

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

		return newGroup
	}

	fun element(
		tag: String,
		attributes: List<String> = listOf()
	): Element {

		println("element(tag=$tag)")

		val newElement = Element(
			tag = tag,
			attributes = attributes
		)

		this.children.add(newElement)
		return newElement
	}

	fun generate(): Grouping {

		println(tag)
		children.forEach {
			println("    ${it.tag}")
		}

		return this

	}

}