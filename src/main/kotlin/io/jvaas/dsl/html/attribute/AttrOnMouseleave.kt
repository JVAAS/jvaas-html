package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnMouseleave : Attr {
	var onmouseleave: String?
		get() = attributes["onmouseleave"]
		set(value) {
			value?.let {
				attributes["onmouseleave"] = it
			}
		}
}	
