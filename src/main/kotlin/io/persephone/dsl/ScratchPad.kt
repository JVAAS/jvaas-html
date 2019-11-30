package io.persephone.helper

import io.persephone.dsl.HTML.body
import io.persephone.dsl.HTML.head
import io.persephone.dsl.HTML.html

object ScratchPad {

	@JvmStatic
	fun main(args: Array<String>) {

		val output1 = html {
			head {
				title { +"this is the title" }
			}
			body {
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
		}
//
//		println(output1)

	}




}

