package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrConTenteditable : Attr {
	var contenteditable: String?
		get() = attributes["contenteditable"]
		set(value) {
			value?.let {
				attributes["contenteditable"] = it
			}
		}
}	
