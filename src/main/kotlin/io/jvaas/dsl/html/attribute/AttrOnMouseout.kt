package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnMouseout : Attr {
	var onmouseout: String?
		get() = attributes["onmouseout"]
		set(value) {
			value?.let {
				attributes["onmouseout"] = it
			}
		}
}	
