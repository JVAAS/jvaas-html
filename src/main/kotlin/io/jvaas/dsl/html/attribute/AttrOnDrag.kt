package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnDrag : Attr {
	var ondrag: String?
		get() = attributes["ondrag"]
		set(value) {
			value?.let {
				attributes["ondrag"] = it
			}
		}
}	
