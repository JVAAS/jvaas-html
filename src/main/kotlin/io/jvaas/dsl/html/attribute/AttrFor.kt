package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrFor : Attr {
	var `for`: String?
		get() = attributes["for"]
		set(value) {
			value?.let {
				attributes["for"] = it
			}
		}
}	
