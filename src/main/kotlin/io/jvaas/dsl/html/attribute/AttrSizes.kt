package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrSizes : Attr {
	var sizes: String?
		get() = attributes["sizes"]
		set(value) {
			value?.let {
				attributes["sizes"] = it
			}
		}
}	