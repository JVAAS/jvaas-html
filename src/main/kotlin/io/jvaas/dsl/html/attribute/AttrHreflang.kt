package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrHreflang : Attr {
	var hreflang: String?
		get() = attributes["hreflang"]
		set(value) {
			value?.let {
				attributes["hreflang"] = it
			}
		}
}	
