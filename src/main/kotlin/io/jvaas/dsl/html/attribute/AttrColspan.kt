package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrColspan : Attr {
	var colspan: String?
		get() = attributes["colspan"]
		set(value) {
			value?.let {
				attributes["colspan"] = it
			}
		}
}	
