package io.persephone.dsl.helper

open class Attribute(
	val tag: String,
	val generates: String? = null,
	val deprecated: Boolean = false,
	val implemented: Boolean = true,
	val experimental: Boolean = false
)