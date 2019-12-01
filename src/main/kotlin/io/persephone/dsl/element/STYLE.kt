package io.persephone.dsl.element

import io.persephone.dsl.*

// generated by Generator.kt [process]
class STYLE : EmptyTag("style") {

	var classes: String?
		get() = attributes.getOrDefault("classes", "")
		set(value) {
			value?.let {
				attributes["classes"] = it
			}
		}

	var media: String?
		get() = attributes.getOrDefault("media", "")
		set(value) {
			value?.let {
				attributes["media"] = it
			}
		}

	var nonce: String?
		get() = attributes.getOrDefault("nonce", "")
		set(value) {
			value?.let {
				attributes["nonce"] = it
			}
		}

	var styles: String?
		get() = attributes.getOrDefault("styles", "")
		set(value) {
			value?.let {
				attributes["styles"] = it
			}
		}

	var title: String?
		get() = attributes.getOrDefault("title", "")
		set(value) {
			value?.let {
				attributes["title"] = it
			}
		}

	var type: String?
		get() = attributes.getOrDefault("type", "")
		set(value) {
			value?.let {
				attributes["type"] = it
			}
		}

}

