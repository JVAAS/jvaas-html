package io.jvaas.dsl.html.funtribute

import io.jvaas.dsl.html.element.TITLE

// generated by HtmlDslGenerator.kt

interface FuntTitle : Funt {

	fun title(
		init: (TITLE.() -> Unit)? = null
	) = TITLE().let {
	
		it.resources = this.resources
		this.children.add(it)
	
	
		init?.invoke(it)
		it
	}

}
