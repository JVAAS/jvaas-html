package io.persephone.dsl

import io.persephone.dsl.element.DIV
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AttributeSortingTest {

	@Test
	fun sortAttributeTest() {

		Assertions.assertEquals(
			// language=HTML
			"""
				<div class="basic">
					<span class="le-class" id="le-id" onclick="leClickHandle()" title="le-title">
						TESTING
					</span>
				</div>
			""".trimIndent(),

			DIV(classes = "basic") {
				span(
					id = "le-id",
					classes = "le-class",
					onclick = "leClickHandle()",
					title = "le-title"
				) {
					+"TESTING"
				}
			}.toString()
		)



	}




}