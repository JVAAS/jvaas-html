package io.persephone.dsl

import io.persephone.dsl.element.DIV
import io.persephone.dsl.element.HTML
import org.junit.jupiter.api.Test

class CustomComponents {

	@Test
	fun testCustomComponentViaClassExtension() {

		println(BLAH3())


	}

	@Test
	fun testCustomComponentViaExtensionMethods() {

		println(
			DIV(classes = "test") {
				blah1() {
					+"TEST1"
				}
			}
		)

	}

	@Test
	fun testCustomSelfClosingComponentViaExtensionMethods() {

		println(DIV(classes = "test") {
			blah2()
		})

	}

	@Test
	fun testCustomComponentInsideDiv() {

		println("===")


	}

	@Test
	fun testDivInsideCustomComponent() {


		println("===")


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
	) : DIV(tagName = "blah")

	class BLAH4 : DIV()

	fun DIV.blah1(
		classes: String? = null,
		init: (BLAH1.() -> Unit)? = null
	) {
		this.children.add(BLAH1().apply {
			init?.invoke(this)
		})
	}

	fun DIV.blah2(classes: String? = null) {

		this.children.add(BLAH2().apply {

		})

	}


}




