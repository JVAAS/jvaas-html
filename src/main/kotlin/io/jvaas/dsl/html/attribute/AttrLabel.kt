package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrLabel : Attr {
	var label: String?
		get() = attributes["label"]
		set(value) {
			value?.let {
				attributes["label"] = it
			}
		}
}	