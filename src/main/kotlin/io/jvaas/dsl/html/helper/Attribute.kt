package io.jvaas.dsl.html.helper

open class Attribute(
	val tag: String,
	val generates: String? = null,
	val deprecated: Boolean = false,
	val implemented: Boolean = true,
	val experimental: Boolean = false,
	val standardized: Boolean = true,
	val readonly: Boolean = false
)