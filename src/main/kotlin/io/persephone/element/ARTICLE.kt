package io.persephone.element

class ARTICLE : BodyTag("article") {

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

