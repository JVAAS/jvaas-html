package io.jvaas.dsl.html

import io.jvaas.dsl.html.element.DIV
import io.jvaas.dsl.html.element.HTML
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CustomComponents {

	@Test
	fun testCustomComponentViaClassExtension() {
		Assertions.assertEquals(

			"""
				<blah>
					<div>
					</div>
				</blah>
			""".trimIndent().trim(),

			BLAH3() {
				div {

				}
			}.toString()

		)
	}

	@Test
	fun testCustomComponentViaExtensionMethods() {
		Assertions.assertEquals(

			"""
				<div class="test1">
					<blah class="test2">
						TEST
					</blah>
				</div>
			""".trimIndent().trim(),

			DIV(classes = "test1") {
				blah1(classes = "test2") {
					+"TEST"
				}
			}.toString()

		)

	}

	@Test
	fun testCustomSelfClosingComponentViaExtensionMethods() {
		Assertions.assertEquals(

			"""
				<div class="test1">
					<blah class="test2" />
				</div>
			""".trimIndent().trim(),

			DIV(classes = "test1") {
				blah2(classes = "test2")
			}.toString()

		)
	}


	class BLAH1(
		init: (BLAH1.() -> Unit)? = null
	) : Tag(
		tagName = "blah",
		selfClosing = false
	) {
		operator fun String.unaryPlus() {
			children.add(Text(this))
		}
	}

	class BLAH2 : Tag(
		tagName = "blah",
		selfClosing = true
	) {

		operator fun String.unaryPlus() {
			children.add(Text(this))
		}

	}

	class BLAH3(
		init: (BLAH3.() -> Unit)? = null
	) : DIV(tagName = "blah") {
		init {
			init?.invoke(this)
		}
	}

	fun DIV.blah1(
		classes: String? = null,
		init: (BLAH1.() -> Unit)? = null
	) {
		this.children.add(BLAH1().apply {
			classes?.let {
				this.attributes.put("class", it)
			}
			init?.invoke(this)
		})
	}

	fun DIV.blah2(classes: String? = null) {
		this.children.add(BLAH2().apply {
			classes?.let {
				this.attributes.put("class", it)
			}
		})
	}


}




