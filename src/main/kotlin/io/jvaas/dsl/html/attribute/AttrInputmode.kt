package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrInputmode : Attr {
	var inputmode: String?
		get() = attributes["inputmode"]
		set(value) {
			value?.let {
				attributes["inputmode"] = it
			}
		}
}	