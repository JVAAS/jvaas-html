package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrPause : Attr {
	var pause: String?
		get() = attributes["pause"]
		set(value) {
			value?.let {
				attributes["pause"] = it
			}
		}
}	
