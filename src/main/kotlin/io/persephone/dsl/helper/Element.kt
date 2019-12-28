package io.persephone.dsl.helper

open class Element(

	val tag: String,
	val selfClosing: Boolean = false,

	val attributes: Array<Attribute> = arrayOf()

)