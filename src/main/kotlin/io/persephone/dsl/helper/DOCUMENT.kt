package io.persephone.dsl.helper

import io.persephone.dsl.element.BODY
import io.persephone.dsl.element.HEAD
import io.persephone.dsl.element.HTML

open class DOCUMENT(
	head: (HEAD.() -> Unit)? = null,
	body: (BODY.() -> Unit)? = null
) {

	val html: HTML = HTML()
	var head: HEAD = HEAD()
	var body: BODY = BODY()

	var title: String? = null
		get() = field
		set(value) {
			this.head.title {
				+"$value"
			}
		}

	init {
		head?.let {
			this.head = html.head(
				init = it
			)
		}
		body?.let {
			this.body = html.body(
				init = it
			)
		}
	}

	override fun toString(): String {
		return "<!DOCTYPE html>\n$html"
	}

}