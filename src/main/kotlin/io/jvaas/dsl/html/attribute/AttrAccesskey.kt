package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrAccesskey : Attr {
	var accesskey: String?
		get() = attributes["accesskey"]
		set(value) {
			value?.let {
				attributes["accesskey"] = it
			}
		}
}	
