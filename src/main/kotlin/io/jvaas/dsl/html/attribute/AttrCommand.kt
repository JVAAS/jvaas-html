package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrCommand : Attr {
	var command: String?
		get() = attributes["command"]
		set(value) {
			value?.let {
				attributes["command"] = it
			}
		}
}	
