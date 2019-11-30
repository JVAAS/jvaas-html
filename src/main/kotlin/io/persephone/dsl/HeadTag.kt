package io.persephone.dsl

import io.persephone.dsl.element.*

abstract class HeadTag(tagName: String) : TagWithText(tagName) {
	fun head(init: HEAD.() -> Unit) = initTag(HEAD(), init)
	fun base(init: BASE.() -> Unit) = initTag(BASE(), init)
	fun link(init: LINK.() -> Unit) = initTag(LINK(), init)
	fun meta(init: META.() -> Unit) = initTag(META(), init)
	fun style(init: STYLE.() -> Unit) = initTag(STYLE(), init)
	fun title(init: TITLE.() -> Unit) = initTag(TITLE(), init)
}
