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

	fun grouping(
		tag: String,
		attributes: List<String> = listOf(),
		children: Grouping? = null,
		init: (Grouping.() -> Unit)? = null
	) {

	}

	fun element(
		tag: String,
		attributes: List<String> = listOf()
	) {

	}

}