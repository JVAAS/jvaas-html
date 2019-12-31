package io.persephone.dsl

import io.persephone.dsl.element.DIV
import io.persephone.dsl.element.HR
import io.persephone.dsl.element.SPAN
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StandaloneTest {

	@Test
	fun divTest() {

		Assertions.assertEquals(
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
			"""
				<hr />
			""".trimIndent(),
			HR().toString()
		)

	}


}