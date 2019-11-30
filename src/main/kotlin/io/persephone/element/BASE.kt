package io.persephone.element

class BASE : HeadTag("base") {

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

	var href: String
		get() = attributes.getOrDefault("href", "")
		set(value) {
			attributes["href"] = value
		}

	var target: String
		get() = attributes.getOrDefault("target", "")
		set(value) {
			attributes["target"] = value
		}

}

