package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnMouseup : Attr {
	var onmouseup: String?
		get() = attributes["onmouseup"]
		set(value) {
			value?.let {
				attributes["onmouseup"] = it
			}
		}
}	
