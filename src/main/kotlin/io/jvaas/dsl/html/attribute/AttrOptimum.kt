package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOptimum : Attr {
	var optimum: String?
		get() = attributes["optimum"]
		set(value) {
			value?.let {
				attributes["optimum"] = it
			}
		}
}	
