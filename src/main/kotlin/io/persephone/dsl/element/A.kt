package io.persephone.dsl.element

import io.persephone.dsl.HtmlTag
import io.persephone.dsl.HeadTag
import io.persephone.dsl.BodyTag
import io.persephone.dsl.EmptyTag

// generated by Generator.kt [process]
class A : BodyTag("a") {

	var download: String?
		get() = attributes.getOrDefault("download", "")
		set(value) {
			value?.let {
				attributes["download"] = it
			}
		}

	var href: String?
		get() = attributes.getOrDefault("href", "")
		set(value) {
			value?.let {
				attributes["href"] = it
			}
		}

	var hreflang: String?
		get() = attributes.getOrDefault("hreflang", "")
		set(value) {
			value?.let {
				attributes["hreflang"] = it
			}
		}

	var media: String?
		get() = attributes.getOrDefault("media", "")
		set(value) {
			value?.let {
				attributes["media"] = it
			}
		}

	var ping: String?
		get() = attributes.getOrDefault("ping", "")
		set(value) {
			value?.let {
				attributes["ping"] = it
			}
		}

	var referrerpolicy: String?
		get() = attributes.getOrDefault("referrerpolicy", "")
		set(value) {
			value?.let {
				attributes["referrerpolicy"] = it
			}
		}

	var rel: String?
		get() = attributes.getOrDefault("rel", "")
		set(value) {
			value?.let {
				attributes["rel"] = it
			}
		}

	var target: String?
		get() = attributes.getOrDefault("target", "")
		set(value) {
			value?.let {
				attributes["target"] = it
			}
		}

	var type: String?
		get() = attributes.getOrDefault("type", "")
		set(value) {
			value?.let {
				attributes["type"] = it
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

