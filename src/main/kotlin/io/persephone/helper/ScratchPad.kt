package io.persephone.helper

import io.persephone.element.html

object ScratchPad {


	@JvmStatic
	fun main(args: Array<String>) {

		val output1 = html {
			head {
				title { +"this is the title" }
			}
			body {
				div(clazz = "TEST") {
					ul {
						li() {
							+"TEST"
						}
					}
				}
			}
		}

		println(output1)

	}



}

