package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrMaxlength : Attr {
	var maxlength: String?
		get() = attributes["maxlength"]
		set(value) {
			value?.let {
				attributes["maxlength"] = it
			}
		}
}	