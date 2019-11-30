package io.persephone.dsl

import io.persephone.dsl.element.BODY
import io.persephone.dsl.element.HEAD

fun html(function: (HTML) -> Unit) {

}



object HTML {





	fun initTag(head: HEAD, init: Any): HEAD {
		return head
	}

	fun initTag(body: BODY, init: Any): BODY {
		return body
	}

}


