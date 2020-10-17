package io.jvaas.dsl.html.helper

open class Element(
	val tag: String,
	val generates: String? = null,
	val deprecated: Boolean = false,
	val selfClosing: Boolean = false,
	val attributes: Array<Attribute> = arrayOf()
)