package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnPlaying : Attr {
	var onplaying: String?
		get() = attributes["onplaying"]
		set(value) {
			value?.let {
				attributes["onplaying"] = it
			}
		}
}	
