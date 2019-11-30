package io.persephone.dsl


object HTML {

	fun html(function: (HTML) -> Unit) {

	}



	fun initTag(head: HEAD, init: Any): HEAD {
		return head
	}

	fun initTag(body: BODY, init: Any): BODY {
		return body
	}

	fun head(head: HEAD.() -> Unit) = initTag(HEAD(), this)
	fun body(head: BODY.() -> Unit) = initTag(BODY(), this)

}


