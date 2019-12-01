package io.persephone.dsl

import io.persephone.dsl.element.HTML

object ScratchPad {


	@JvmStatic
	fun main(args: Array<String>) {


		val output = HTML().body {
			div(styles = "color: red") {
				div(classes = "charcoal text:white") {
					+"TEST1"
					div {
						+"TEST2"

						img(src = "blah.png", alt = "blah", loading = "lazy", decoding = "async")
						br {}
						br()
						span {
							input(type = "text")
						}
						custom(classes = "test") {
							span {
								img(src = "blah2.png")
							}
						}
					}
				}
			}
		}
		println(output)

	}


}

class CUSTOM : BodyTag(tagName = "custom") {
	var classes: String? = null
	var styles: String? = null
}

fun BodyTag.custom(
	classes: String? = null,
	styles: String? = null,
	init: (CUSTOM.() -> Unit)? = null
): CUSTOM {
	initTag(CUSTOM(), init).apply {
		this.classes = classes
		this.styles = styles
	}
	return CUSTOM()
}


