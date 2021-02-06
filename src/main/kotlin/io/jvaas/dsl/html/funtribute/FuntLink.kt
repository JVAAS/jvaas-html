package io.jvaas.dsl.html.funtribute

import io.jvaas.dsl.html.element.LINK

// generated by HtmlDslGenerator.kt

interface FuntLink : Funt {

	fun link(
		href: String? = null,
		rel: String? = null,
		type: String? = null
	) = LINK().let {
	
		it.resources = this.resources
		this.children.add(it)
	
		it.href = href
		it.rel = rel
		it.type = type
	
		it
	}

}
