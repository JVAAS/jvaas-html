package io.persephone.dsl.helper

import io.persephone.dsl.HtmlTag
import io.persephone.dsl.element.BODY
import io.persephone.dsl.element.HEAD

class Document(
	val head: HEAD.() -> Unit,
	val body: BODY.() -> Unit
) : HtmlTag("html") {

	fun head() = initTag(HEAD(), head).apply {

	}

	fun body() = initTag(BODY(), body).apply {

	}

	// language=HTML5
	override fun toString(): String = """<!DOCTYPE html>
<html>
${head()}
${body()}
</html>
"""


}