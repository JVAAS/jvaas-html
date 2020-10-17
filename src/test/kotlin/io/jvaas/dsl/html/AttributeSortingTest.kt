package io.jvaas.dsl.html

import io.jvaas.dsl.html.element.DIV
import org.junit.Test
import kotlin.test.assertEquals

class AttributeSortingTest {

	@Test
	fun sortAttributeTest() {

		assertEquals(
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