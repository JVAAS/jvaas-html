package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrComplete : Attr {
	var complete: String?
		get() = attributes["complete"]
		set(value) {
			value?.let {
				attributes["complete"] = it
			}
		}
}	
