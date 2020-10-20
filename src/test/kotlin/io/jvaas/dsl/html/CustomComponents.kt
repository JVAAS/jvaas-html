package io.jvaas.dsl.html

import io.jvaas.dsl.html.element.DIV
import org.junit.Test
import javax.management.Query.div
import kotlin.test.assertEquals

class CustomComponents {

	@Test
	fun testCustomComponentViaClassExtension() {
		assertEquals(

			"""
				<blah>
					<div>
					</div>
				</blah>
			""".trimIndent().trim(),

			BLAH3() {
				//div {

				//}
			}.toString()

		)
	}

	@Test
	fun testCustomComponentViaExtensionMethods() {
		assertEquals(

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
		assertEquals(

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

	@Test
	fun testResources() {
		val div = DIV(classes  = "div")	{
			this.resources = mutableListOf()
			div {
				div {
					blah1 { }
					blah2()
				}
				blah2()
			}
		}

		println("==================")
		println(div.resources?.size)
		div.resources?.forEach {
			println(it)
		}
		println("==================")

	}



	data class CSS(val path: String): Resource

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
		this.resources?.add(CSS(path = "style1.css"))
		this.children.add(BLAH1().apply {
			classes?.let {
				this.attributes.put("class", it)
			}
			init?.invoke(this)
		})
	}

	fun DIV.blah2(classes: String? = null) {
		this.resources?.add(CSS(path = "style2.css"))
		this.children.add(BLAH2().apply {
			classes?.let {
				this.attributes.put("class", it)
			}
		})
	}


}




