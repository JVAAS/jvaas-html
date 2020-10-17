package io.jvaas.dsl.html.element

import io.jvaas.dsl.html.*

// generated by HtmlDslGenerator.kt

open class TITLE(
	tagName: String = "title",
	selfClosing: Boolean = false,
	init: (TITLE.() -> Unit)? = null
) : Tag(
	tagName = tagName,
	selfClosing = selfClosing
) {

	init {

		init?.invoke(this)
	}

	operator fun String.unaryPlus() {
		children.add(Text(this))
	}

}