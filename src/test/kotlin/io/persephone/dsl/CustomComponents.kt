package io.persephone.dsl

import io.persephone.dsl.element.DIV
import org.junit.jupiter.api.Test

class CustomComponents {

	@Test
	fun testCustomComponentViaClassExtension() {

		println(BLAH3())




	}

	@Test
	fun testCustomComponentViaExtensionMethods() {

		println(DIV(classes = "test") {
			blah1()
		})

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


	class BLAH1 : Tag(
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

	class BLAH3 : DIV(tagName = "blah") {

	}
	class BLAH4 : DIV()

	fun DIV.blah1(classes: String? = null) {

		this.children.add(BLAH1().apply {

		})

	}

	fun DIV.blah2(classes: String? = null) {

		this.children.add(BLAH2().apply {

		})

	}


}




