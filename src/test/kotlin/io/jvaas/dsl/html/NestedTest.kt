package io.jvaas.dsl.html

import io.jvaas.dsl.html.element.DIV
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NestedTest {

	@Test
	fun nestedDivSpanAnchorHr() {

		Assertions.assertEquals(

			// language=HTML
			"""
				<div class="div1">
					<div class="div2">
						<div>
							<div>
							</div>
						</div>
						<hr />
						<span>
						</span>
					</div>
					<span class="span2">
						<a class="a1" href="#">
							Hello World
						</a>
					</span>
				</div>
			""".trimIndent(),

			DIV(classes = "div1") {
				div(classes = "div2") {
					div {
						div()
					}
					hr()
					span {

					}
				}
				span(classes = "span2") {
					a(href = "#", classes = "a1") {
						+"Hello World"
					}
				}
			}.toString()

		)


	}


}