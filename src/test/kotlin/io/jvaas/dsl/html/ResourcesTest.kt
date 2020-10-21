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
					blah1 {

					}
				}

			}
			div {
				blah1 {

				}
			}
		})

		//assertEquals(3, doc.resources.size)

		println("===========")
		println(doc.toString())
		println(doc.resources)
		println("===========")


	}

	fun Tag.blah1(
		classes: String? = null,
		init: (DIV.() -> Unit)? = null,
	) {
		this.resources?.add(CustomComponents.CSS("blah1.css"))
		this.children.add(DIV(classes = classes).apply {
			this.resources = this@blah1.resources
			init?.invoke(this)
		})
	}


}