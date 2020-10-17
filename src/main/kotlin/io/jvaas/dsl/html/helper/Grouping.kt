package io.jvaas.dsl.html.helper

class Grouping(
	tag: String,
	generates: String? = null,
	deprecated: Boolean = false,
	attributes: Array<Attribute> = arrayOf(),
	init: (Grouping.() -> Unit)? = null

) : Element(
	tag = tag,
	selfClosing = false,
	generates = generates,
	deprecated = deprecated,
	attributes = attributes
) {

	var children: MutableList<Element> = mutableListOf()

	init {
		init?.invoke(this)
	}

	fun grouping(
		tag: String,
		generates: String? = null,
		deprecated: Boolean = false,
		attributes: Array<Attribute> = arrayOf(),
		children: MutableList<Element>? = null,
		init: (Grouping.() -> Unit)? = null
	): Grouping {

		val newGroup = Grouping(
			tag = tag,
			generates = generates,
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
		generates: String? = null,
		deprecated: Boolean = false,
		selfClosing: Boolean = false,
		attributes: Array<Attribute> = arrayOf()
	): Element {

		val newElement = Element(
			tag = tag,
			generates = generates,
			attributes = attributes,
			selfClosing = selfClosing
		)

		this.children.add(newElement)
		return newElement
	}

}