package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrShape : Attr {
	var shape: String?
		get() = attributes["shape"]
		set(value) {
			value?.let {
				attributes["shape"] = it
			}
		}
}	