package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrAutocapitalize : Attr {
	var autocapitalize: String?
		get() = attributes["autocapitalize"]
		set(value) {
			value?.let {
				attributes["autocapitalize"] = it
			}
		}
}	
