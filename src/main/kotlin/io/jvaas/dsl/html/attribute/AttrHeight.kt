package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrHeight : Attr {
	var height: String?
		get() = attributes["height"]
		set(value) {
			value?.let {
				attributes["height"] = it
			}
		}
}	
