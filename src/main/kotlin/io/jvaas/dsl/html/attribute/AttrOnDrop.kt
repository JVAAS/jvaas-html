package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnDrop : Attr {
	var ondrop: String?
		get() = attributes["ondrop"]
		set(value) {
			value?.let {
				attributes["ondrop"] = it
			}
		}
}	
