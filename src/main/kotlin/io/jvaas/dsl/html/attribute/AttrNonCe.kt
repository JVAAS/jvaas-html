package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrNonCe : Attr {
	var nonce: String?
		get() = attributes["nonce"]
		set(value) {
			value?.let {
				attributes["nonce"] = it
			}
		}
}	