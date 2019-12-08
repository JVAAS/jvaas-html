package io.persephone.dsl.element

import io.persephone.dsl.*

// generated by Generator.kt [generateChildElements]
class STYLE : HeadTag("style") {

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

