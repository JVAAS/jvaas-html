package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrWrap : Attr {
	var wrap: String?
		get() = attributes["wrap"]
		set(value) {
			value?.let {
				attributes["wrap"] = it
			}
		}
}	