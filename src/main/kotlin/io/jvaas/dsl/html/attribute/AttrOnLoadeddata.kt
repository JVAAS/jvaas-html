package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnLoadeddata : Attr {
	var onloadeddata: String?
		get() = attributes["onloadeddata"]
		set(value) {
			value?.let {
				attributes["onloadeddata"] = it
			}
		}
}	