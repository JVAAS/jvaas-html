package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrFormmethod : Attr {
	var formmethod: String?
		get() = attributes["formmethod"]
		set(value) {
			value?.let {
				attributes["formmethod"] = it
			}
		}
}	
