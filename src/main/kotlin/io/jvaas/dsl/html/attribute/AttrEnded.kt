package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrEnded : Attr {
	var ended: String?
		get() = attributes["ended"]
		set(value) {
			value?.let {
				attributes["ended"] = it
			}
		}
}	
