package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrFormnovalidate : Attr {
	var formnovalidate: String?
		get() = attributes["formnovalidate"]
		set(value) {
			value?.let {
				attributes["formnovalidate"] = it
			}
		}
}	
