package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrOnVolumechange : Attr {
	var onvolumechange: String?
		get() = attributes["onvolumechange"]
		set(value) {
			value?.let {
				attributes["onvolumechange"] = it
			}
		}
}	