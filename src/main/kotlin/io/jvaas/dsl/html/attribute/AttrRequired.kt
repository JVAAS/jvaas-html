package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrRequired : Attr {
	var required: String?
		get() = attributes["required"]
		set(value) {
			value?.let {
				attributes["required"] = it
			}
		}
}	
