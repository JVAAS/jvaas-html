package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnAutocomplete : Attr {
	var onautocomplete: String?
		get() = attributes["onautocomplete"]
		set(value) {
			value?.let {
				attributes["onautocomplete"] = it
			}
		}
}	
