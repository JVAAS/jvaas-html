package io.persephone.helper

import io.persephone.dsl.element.BODY
import io.persephone.dsl.element.HEAD

object ScratchPad {

	@JvmStatic
	fun main(args: Array<String>) {

		val output1 =
			HEAD().head {
				title { +"this is the title" }
			}

		val output2 =
			BODY().body {
				div() {
					ul {
						li {
							+"TEST1"
						}
						li {
							+"TEST2"
						}

					}
				}
			}

		println(output1)
		println(output2)

	}




}

