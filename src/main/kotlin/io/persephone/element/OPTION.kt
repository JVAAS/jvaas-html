package io.persephone.element

class OPTION : BodyTag("option") {

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

