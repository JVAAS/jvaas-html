package io.persephone.dsl.element

import io.persephone.dsl.HeadTag
import io.persephone.dsl.BodyTag

class LINK : HeadTag("link") {

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

	var rel: String
		get() = attributes.getOrDefault("rel", "")
		set(value) {
			attributes["rel"] = value
		}

	var type: String
		get() = attributes.getOrDefault("type", "")
		set(value) {
			attributes["type"] = value
		}

	var href: String
		get() = attributes.getOrDefault("href", "")
		set(value) {
			attributes["href"] = value
		}

}

