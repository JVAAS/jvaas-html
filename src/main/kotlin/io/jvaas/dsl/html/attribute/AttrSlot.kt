package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrSlot : Attr {
	var slot: String?
		get() = attributes["slot"]
		set(value) {
			value?.let {
				attributes["slot"] = it
			}
		}
}	