package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrWaiting : Attr {
	var waiting: String?
		get() = attributes["waiting"]
		set(value) {
			value?.let {
				attributes["waiting"] = it
			}
		}
}	
