package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnRatechange : Attr {
	var onratechange: String?
		get() = attributes["onratechange"]
		set(value) {
			value?.let {
				attributes["onratechange"] = it
			}
		}
}	
