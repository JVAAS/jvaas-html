package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnAfterprint : Attr {
	var onafterprint: String?
		get() = attributes["onafterprint"]
		set(value) {
			value?.let {
				attributes["onafterprint"] = it
			}
		}
}	