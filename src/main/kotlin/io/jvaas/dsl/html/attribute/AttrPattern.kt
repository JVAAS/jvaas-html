package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrPattern : Attr {
	var pattern: String?
		get() = attributes["pattern"]
		set(value) {
			value?.let {
				attributes["pattern"] = it
			}
		}
}	
