package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrClasses : Attr {
	var classes: String?
		get() = attributes["class"]
		set(value) {
			value?.let {
				attributes["class"] = it
			}
		}
}	