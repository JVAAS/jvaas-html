package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnOpstate : Attr {
	var onopstate: String?
		get() = attributes["onopstate"]
		set(value) {
			value?.let {
				attributes["onopstate"] = it
			}
		}
}	
