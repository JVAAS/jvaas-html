package io.persephone.dsl

import io.persephone.dsl.element.*

// generated by Generator.kt [processBasic]
abstract class HtmlTag(tagName: String) : TagWithText(tagName) {
	fun head(init: HEAD.() -> Unit) = initTag(HEAD(), init)
	fun body(init: BODY.() -> Unit) = initTag(BODY(), init)
}