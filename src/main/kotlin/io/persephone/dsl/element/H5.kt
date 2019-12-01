package io.persephone.dsl.element

import io.persephone.dsl.*

// generated by Generator.kt [process]
class H5 : BodyTag("h5") {

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

