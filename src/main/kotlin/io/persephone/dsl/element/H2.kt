package io.persephone.dsl.element

import io.persephone.dsl.BodyTag

// generated by Generator.kt [process]
class H2 : BodyTag("h2") {

	var clazz: String
		get() = attributes.getOrDefault("clazz", "")
		set(value) {
			attributes["clazz"] = value
		}

	var style: String
		get() = attributes.getOrDefault("style", "")
		set(value) {
			attributes["style"] = value
		}

}

