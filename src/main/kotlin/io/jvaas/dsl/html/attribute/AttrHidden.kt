package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrHidden : Attr {
	var hidden: String?
		get() = attributes["hidden"]
		set(value) {
			value?.let {
				attributes["hidden"] = it
			}
		}
}	