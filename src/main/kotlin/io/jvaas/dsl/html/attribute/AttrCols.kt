package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrCols : Attr {
	var cols: String?
		get() = attributes["cols"]
		set(value) {
			value?.let {
				attributes["cols"] = it
			}
		}
}	
