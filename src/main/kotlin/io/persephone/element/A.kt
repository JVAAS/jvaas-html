package io.persephone.element

class A : BodyTag("a") {

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

	var download: String
		get() = attributes.getOrDefault("download", "")
		set(value) {
			attributes["download"] = value
		}

	var href: String
		get() = attributes.getOrDefault("href", "")
		set(value) {
			attributes["href"] = value
		}

	var hreflang: String
		get() = attributes.getOrDefault("hreflang", "")
		set(value) {
			attributes["hreflang"] = value
		}

	var media: String
		get() = attributes.getOrDefault("media", "")
		set(value) {
			attributes["media"] = value
		}

	var ping: String
		get() = attributes.getOrDefault("ping", "")
		set(value) {
			attributes["ping"] = value
		}

	var referrerpolicy: String
		get() = attributes.getOrDefault("referrerpolicy", "")
		set(value) {
			attributes["referrerpolicy"] = value
		}

	var rel: String
		get() = attributes.getOrDefault("rel", "")
		set(value) {
			attributes["rel"] = value
		}

	var target: String
		get() = attributes.getOrDefault("target", "")
		set(value) {
			attributes["target"] = value
		}

	var type: String
		get() = attributes.getOrDefault("type", "")
		set(value) {
			attributes["type"] = value
		}

}

