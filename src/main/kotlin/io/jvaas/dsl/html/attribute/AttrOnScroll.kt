package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnScroll : Attr {
	var onscroll: String?
		get() = attributes["onscroll"]
		set(value) {
			value?.let {
				attributes["onscroll"] = it
			}
		}
}	