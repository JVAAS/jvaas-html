package io.persephone.dsl.helper

data class ED(

	val tag: String,
	val selfClosing: Boolean = false,

	val attributes: List<String> = listOf(),
	val extends: String

)