package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnStalled : Attr {
	var onstalled: String?
		get() = attributes["onstalled"]
		set(value) {
			value?.let {
				attributes["onstalled"] = it
			}
		}
}	