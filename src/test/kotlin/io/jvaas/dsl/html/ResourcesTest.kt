package io.jvaas.dsl.html

import io.jvaas.dsl.html.element.DIV
import io.jvaas.dsl.html.helper.DOCUMENT
import org.junit.Test

class ResourcesTest {

	@Test
	fun testDocument() {


		val doc = DOCUMENT({

		}, {
			div {
				blah1 {

				}
				blah1 {

				}
			}
			div {
				blah1 {

				}
			}
		})

		println("===========")
		println(doc.resources)
		println("===========")


	}

	fun DIV.blah1(
		classes: String? = null,
		init: (CustomComponents.BLAH1.() -> Unit)? = null,
	) {
		this.resources?.add(CustomComponents.CSS(path = "style1.css"))
		this.children.add(CustomComponents.BLAH1().apply {
			classes?.let {
				this.attributes.put("class", it)
			}
			init?.invoke(this)
		})
	}


}