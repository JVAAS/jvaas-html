package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrIsmap : Attr {
	var ismap: String?
		get() = attributes["ismap"]
		set(value) {
			value?.let {
				attributes["ismap"] = it
			}
		}
}	
