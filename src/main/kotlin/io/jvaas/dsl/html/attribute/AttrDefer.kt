package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrDefer : Attr {
	var defer: String?
		get() = attributes["defer"]
		set(value) {
			value?.let {
				attributes["defer"] = it
			}
		}
}	
