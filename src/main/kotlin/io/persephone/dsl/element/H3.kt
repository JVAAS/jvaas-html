package io.persephone.dsl.element

import io.persephone.dsl.BodyTag

// generated by Generator.kt [generateChildElements]
class H3 : BodyTag("h3") {

	var classes: String?
		get() = attributes.getOrDefault("classes", "")
		set(value) {
			value?.let {
				attributes["classes"] = it
			}
		}

	var styles: String?
		get() = attributes.getOrDefault("styles", "")
		set(value) {
			value?.let {
				attributes["styles"] = it
			}
		}

}

