package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrDuration : Attr {
	var duration: String?
		get() = attributes["duration"]
		set(value) {
			value?.let {
				attributes["duration"] = it
			}
		}
}	