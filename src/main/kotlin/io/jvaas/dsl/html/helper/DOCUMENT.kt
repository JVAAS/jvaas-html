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
			).apply { resources = this@DOCUMENT.resources }
		}
		body?.let {
			this.body = html.body(
				init = it
			).apply { resources = this@DOCUMENT.resources }
		}
	}

	override fun toString(): String {
		return "<!DOCTYPE html>\n$html"
	}

}