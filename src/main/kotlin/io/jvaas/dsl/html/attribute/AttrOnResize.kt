package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnResize : Attr {
	var onresize: String?
		get() = attributes["onresize"]
		set(value) {
			value?.let {
				attributes["onresize"] = it
			}
		}
}	
