package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnDurationchange : Attr {
	var ondurationchange: String?
		get() = attributes["ondurationchange"]
		set(value) {
			value?.let {
				attributes["ondurationchange"] = it
			}
		}
}	