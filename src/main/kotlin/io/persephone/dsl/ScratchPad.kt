package io.persephone.dsl

import io.persephone.dsl.element.DIV
import kotlin.concurrent.thread

object ScratchPad {


	@JvmStatic
	fun main(args: Array<String>) {


		println(

			DIV(classes = "div1") {
				+"text1"
				a(href = "#") {
					+"text2"
					div(classes = "div2") {
						+"text3"
						href = ""
					}
					div(classes = "div3") {
						+"text4"
						href
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

