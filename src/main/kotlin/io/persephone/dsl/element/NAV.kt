package io.persephone.dsl.element

import io.persephone.dsl.HtmlTag
import io.persephone.dsl.HeadTag
import io.persephone.dsl.BodyTag
import io.persephone.dsl.EmptyTag

// generated by Generator.kt [process]
class NAV : BodyTag("nav") {

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

