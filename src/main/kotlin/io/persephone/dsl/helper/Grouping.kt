package io.persephone.dsl.helper

class Grouping(

	tag: String,
	attributes: List<String> = listOf(),
	init: Grouping.() -> Unit

): Element(
	tag = tag,
	selfClosing = false,
	attributes = attributes
) {

	val children: List<Element>
		get() = this.leChildren.toList()


	val leChildren = mutableListOf<Element>()

	fun grouping(
		tag: String,
		attributes: List<String> = listOf(),
		children: List<Element>? = null,
		init: (Grouping.() -> Unit)? = null
	) {

		println("grouping(tag=$tag)")

		this.leChildren.add(Element(
			tag = tag,
			attributes = attributes
		))
	}

	fun element(
		tag: String,
		attributes: List<String> = listOf()
	) {

		println("element(tag=$tag)")

		this.leChildren.add(Element(
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