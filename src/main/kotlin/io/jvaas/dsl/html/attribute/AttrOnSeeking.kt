package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnSeeking : Attr {
	var onseeking: String?
		get() = attributes["onseeking"]
		set(value) {
			value?.let {
				attributes["onseeking"] = it
			}
		}
}	
