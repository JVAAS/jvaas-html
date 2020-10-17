package io.jvaas.dsl.html

import io.jvaas.dsl.html.element.DIV
import io.jvaas.dsl.html.element.HR
import io.jvaas.dsl.html.element.SPAN
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StandaloneTest {

	@Test
	fun divTest() {

		Assertions.assertEquals(
			// language=HTML
			"""
				<div class="basic">
				</div>
			""".trimIndent(),
			DIV(classes = "basic").toString()
		)

	}

	@Test
	fun spanTest() {

		Assertions.assertEquals(
			// language=HTML
			"""
				<span class="basic">
				</span>
			""".trimIndent(),
			SPAN(classes = "basic").toString()
		)

	}

	@Test
	fun hrTest() {

		Assertions.assertEquals(
			// language=HTML
			"""
				<hr />
			""".trimIndent(),
			HR().toString()
		)

	}


}