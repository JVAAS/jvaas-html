package io.persephone.dsl.element

import io.persephone.dsl.HeadTag
import io.persephone.dsl.BodyTag

class DIR : BodyTag("dir") {

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

