package io.persephone.dsl

import io.persephone.dsl.element.DIV
import io.persephone.dsl.element.HTML
import kotlin.concurrent.thread

object ScratchPad {


	@JvmStatic
	fun main(args: Array<String>) {


		println(
			DIV(classes = "div1") {
				+"text1"
				a(href = "#0") {
					+"text2"
					div(classes = "div2") {
						+"text3"
					}
					div(classes = "div3") {
						+"text4"
					}
				}
				hr(classes = "hr1")
				span(classes = "span1") {
					+"text5"
				}
			}


		)


	}
}

