package io.persephone.dsl

import io.persephone.dsl.element.DIV

object ScratchPad {


	@JvmStatic
	fun main(args: Array<String>) {

		val div = DIV(classes = "test1") {
			div(classes = "test2") {
				span(classes = "test3") {
					+"TEST"
					span {
						+"TEST"
					}
					hr()
					span()
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

