package io.jvaas.dsl.html

import io.jvaas.dsl.html.element.DIV
import io.jvaas.dsl.html.element.HR
import io.jvaas.dsl.html.element.SPAN
import org.junit.Test
import kotlin.test.assertEquals

class StandaloneTest {

	@Test
	fun divTest() {

		assertEquals(
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

		assertEquals(
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

		assertEquals(
			// language=HTML
			"""
				<hr />
			""".trimIndent(),
			HR().toString()
		)

	}


}