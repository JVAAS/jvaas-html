package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrUsemap : Attr {
	var usemap: String?
		get() = attributes["usemap"]
		set(value) {
			value?.let {
				attributes["usemap"] = it
			}
		}
}	