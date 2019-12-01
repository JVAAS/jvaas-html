package io.persephone.dsl.element

import io.persephone.dsl.*

// generated by Generator.kt [process]
class META : EmptyTag("meta") {

	var charset: String?
		get() = attributes.getOrDefault("charset", "")
		set(value) {
			value?.let {
				attributes["charset"] = it
			}
		}

	var name: String?
		get() = attributes.getOrDefault("name", "")
		set(value) {
			value?.let {
				attributes["name"] = it
			}
		}

	var content: String?
		get() = attributes.getOrDefault("content", "")
		set(value) {
			value?.let {
				attributes["content"] = it
			}
		}

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

