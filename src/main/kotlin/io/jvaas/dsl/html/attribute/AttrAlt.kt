package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrAlt : Attr {
	var alt: String?
		get() = attributes["alt"]
		set(value) {
			value?.let {
				attributes["alt"] = it
			}
		}
}	
