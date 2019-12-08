package io.persephone.dsl.helper

open class Element(

	val tag: String,
	val selfClosing: Boolean = false,

	val attributes: List<String> = listOf(),
	val extends: String = ""

)