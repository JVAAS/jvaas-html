package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrCanplay : Attr {
	var canplay: String?
		get() = attributes["canplay"]
		set(value) {
			value?.let {
				attributes["canplay"] = it
			}
		}
}	
