package io.jvaas.dsl.html.attribute

// generated by HtmlDslGenerator.kt

interface AttrSpellcheck : Attr {
	var spellcheck: String?
		get() = attributes["spellcheck"]
		set(value) {
			value?.let {
				attributes["spellcheck"] = it
			}
		}
}	