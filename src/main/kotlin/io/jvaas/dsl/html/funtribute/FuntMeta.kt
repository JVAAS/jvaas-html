package io.jvaas.dsl.html.funtribute

import io.jvaas.dsl.html.element.META

// generated by HtmlDslGenerator.kt

interface FuntMeta : Funt {

	fun meta(
		charset: String? = null,
		content: String? = null,
		name: String? = null
	) = META().let {
	
		it.resources = this.resources
		this.children.add(it)
	
		it.charset = charset
		it.content = content
		it.name = name
	
		it
	}

}
