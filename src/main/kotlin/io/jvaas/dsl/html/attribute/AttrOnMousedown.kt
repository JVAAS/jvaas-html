package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnMousedown : Attr {
	var onmousedown: String?
		get() = attributes["onmousedown"]
		set(value) {
			value?.let {
				attributes["onmousedown"] = it
			}
		}
}	
