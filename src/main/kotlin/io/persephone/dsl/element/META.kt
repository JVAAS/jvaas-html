package io.persephone.dsl.element

class META : HeadTag("meta") {

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

	var charset: String
		get() = attributes.getOrDefault("charset", "")
		set(value) {
			attributes["charset"] = value
		}

	var name: String
		get() = attributes.getOrDefault("name", "")
		set(value) {
			attributes["name"] = value
		}

	var content: String
		get() = attributes.getOrDefault("content", "")
		set(value) {
			attributes["content"] = value
		}

}
