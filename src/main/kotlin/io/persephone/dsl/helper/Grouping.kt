package io.persephone.dsl.helper

class Grouping(

	tag: String,
	deprecated: Boolean = false,
	attributes: Array<Attribute> = arrayOf(),
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
		deprecated: Boolean = false,
		attributes: Array<Attribute> = arrayOf(),
		children: MutableList<Element>? = null,
		init: (Grouping.() -> Unit)? = null
	): Grouping {

		val newGroup = Grouping(
			tag = tag,
			attributes = attributes,
			deprecated = deprecated,
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
		deprecated: Boolean = false,
		selfClosing: Boolean = false,
		attributes: Array<Attribute> = arrayOf()
	): Element {

		val newElement = Element(
			tag = tag,
			attributes = attributes,
			selfClosing = selfClosing
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