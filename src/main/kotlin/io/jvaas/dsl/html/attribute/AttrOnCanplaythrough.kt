package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnCanplaythrough : Attr {
	var oncanplaythrough: String?
		get() = attributes["oncanplaythrough"]
		set(value) {
			value?.let {
				attributes["oncanplaythrough"] = it
			}
		}
}	