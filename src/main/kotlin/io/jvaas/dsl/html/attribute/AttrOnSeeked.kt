package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnSeeked : Attr {
	var onseeked: String?
		get() = attributes["onseeked"]
		set(value) {
			value?.let {
				attributes["onseeked"] = it
			}
		}
}	
