package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrPart : Attr {
	var part: String?
		get() = attributes["part"]
		set(value) {
			value?.let {
				attributes["part"] = it
			}
		}
}	
