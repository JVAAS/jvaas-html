package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrItemtype : Attr {
	var itemtype: String?
		get() = attributes["itemtype"]
		set(value) {
			value?.let {
				attributes["itemtype"] = it
			}
		}
}	
