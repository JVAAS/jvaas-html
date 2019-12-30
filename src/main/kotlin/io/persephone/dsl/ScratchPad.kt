package io.persephone.dsl

import io.persephone.dsl.element.DIV

object ScratchPad {


	@JvmStatic
	fun main(args: Array<String>) {

		val div = DIV(classes = "testing") {
			div(classes = "testing") {
				span {
					+"TEST"
					span {
						+"TEST"
					}
				}
			}
			a {
				this.href = ""
				span {
					this.classes = ""
					this@a.href = ""
				}
			}
		}

		println(div)

	}
}

