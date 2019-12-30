package io.persephone.dsl

//import io.persephone.dsl.element.DIV

object ScratchPad {


	@JvmStatic
	fun main(args: Array<String>) {

//		DIV(classes = "testing") {
//			div(classes = "testing") {
//				span {
//					+"TEST"
//					span {
//						+"TEST"
//					}
//				}
//			}
//			a {
//				this.href = ""
//				span {
//					this.classes = ""
//					this@a.href = ""
//				}
//			}
//		}


//		SPAN(classes = "test") {
//			a {
//				h1 {
//				}
//			}
//		}


//		val output2 = Document(
//			head = {
//				// meta(name = "test", type = "test")
//			},
//			body = {
//				div(styles = "color: red") {
//					div(classes = "charcoal text:white") {
//						+"TEST1"
//						div {
//							+"TEST2"
//
//							img(src = "blah.png", alt = "blah", loading = "lazy", decoding = "async")
//							br()
//							span {
//								input(type = "text")
//							}
//							custom(classes = "test", blah = "testing") {
//								span {
//									img(src = "blah2.png")
//								}
//							}
//						}
//					}
//				}
//			}
//		).toString()
//
//		println(output2)

	}
}

//class CUSTOM : BodyTag(tagName = "div")
//
//fun BodyTag.custom(
//	classes: String? = null,
//	blah: String? = null,
//	init: (CUSTOM.() -> Unit)? = null
//): CUSTOM {
//	return initTag(CUSTOM(), init).apply {
//		classes?.let {
//			this.attributes["classes"] = it
//		}
//		blah?.let {
//			this.attributes["blah"] = it
//		}
//	}.let {
//		it.div {
//			+"TEST3"
//		}
//		it.div {
//			+"TEST4"
//		}
//		it
//	}
//}


