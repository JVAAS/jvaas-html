package io.persephone.dsl

import io.persephone.dsl.element.HTML

object ScratchPad {

	@JvmStatic
	fun main(args: Array<String>) {


		val output = HTML().body {
			div {
				div {
					+"TEST1"
					div {
						+"TEST2"
					}
				}
			}

		}
		println(output)

//		val output1 =
//			HTML().head {
//				title {
//					+"this is the title"
//
//				}
//			}
//
//		val output2 =
//			HTML().html {
//				div() {
//					ul {
//						li {
//							+"TEST1"
//						}
//						li {
//							+"TEST2"
//						}
//
//					}
//				}
//			}

//		println(output1)
//		println(output2)

	}




}

