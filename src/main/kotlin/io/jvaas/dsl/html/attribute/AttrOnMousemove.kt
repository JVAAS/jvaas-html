package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnMousemove : Attr {
	var onmousemove: String?
		get() = attributes["onmousemove"]
		set(value) {
			value?.let {
				attributes["onmousemove"] = it
			}
		}
}	
