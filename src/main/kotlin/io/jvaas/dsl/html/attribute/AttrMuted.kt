package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrMuted : Attr {
	var muted: String?
		get() = attributes["muted"]
		set(value) {
			value?.let {
				attributes["muted"] = it
			}
		}
}	
