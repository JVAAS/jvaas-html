package io.jvaas.dsl.html.helper

import io.jvaas.dsl.html.Resource
import io.jvaas.dsl.html.element.BODY
import io.jvaas.dsl.html.element.HEAD
import io.jvaas.dsl.html.element.HTML

open class DOCUMENT(
	head: (HEAD.() -> Unit)? = null,
	body: (BODY.() -> Unit)? = null
) {

	val resources = mutableListOf<Resource>()
	val html: HTML = HTML().apply { this.resources = this@DOCUMENT.resources }
	var head: HEAD = HEAD().apply { this.resources = this@DOCUMENT.resources }
	var body: BODY = BODY().apply { this.resources = this@DOCUMENT.resources }

	var title: String? = null
		set(value) {
			field = value
			this.head.title {
				+"$value"
			}
		}

	var description: String? = null
		set(value) {
			field = value
			this.head.meta(name = "description", content = value)
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