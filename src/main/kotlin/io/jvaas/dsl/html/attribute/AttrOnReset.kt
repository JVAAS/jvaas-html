package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnReset : Attr {
	var onreset: String?
		get() = attributes["onreset"]
		set(value) {
			value?.let {
				attributes["onreset"] = it
			}
		}
}	
