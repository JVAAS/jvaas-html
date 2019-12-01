package io.persephone.dsl.element

import io.persephone.dsl.HtmlTag
import io.persephone.dsl.HeadTag
import io.persephone.dsl.BodyTag
import io.persephone.dsl.EmptyTag

// generated by Generator.kt [process]
class LINK : EmptyTag("link") {

	var rel: String?
		get() = attributes.getOrDefault("rel", "")
		set(value) {
			value?.let {
				attributes["rel"] = it
			}
		}

	var type: String?
		get() = attributes.getOrDefault("type", "")
		set(value) {
			value?.let {
				attributes["type"] = it
			}
		}

	var href: String?
		get() = attributes.getOrDefault("href", "")
		set(value) {
			value?.let {
				attributes["href"] = it
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

