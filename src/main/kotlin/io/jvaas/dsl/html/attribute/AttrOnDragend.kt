package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnDragend : Attr {
	var ondragend: String?
		get() = attributes["ondragend"]
		set(value) {
			value?.let {
				attributes["ondragend"] = it
			}
		}
}	
