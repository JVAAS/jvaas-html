package io.persephone.dsl

import io.persephone.dsl.element.DIV
import org.junit.jupiter.api.Test
import kotlin.random.Random

class FlowTest {

	@Test
	fun ifElseLoopTest() {

		val a = Random(100).nextInt(0, 5)

		val snippet = DIV {

			+"random value = $a"

			if (a == 1) {
				span {
					+"ONE"
				}
			}

			when (a) {
				2 -> span {
					+"TWO"
				}
				3 -> span {
					+"THREE"
				}
			}

			ul {
				(0..a).forEach {
					li() {
						+"$it"
					}
				}
			}
		}

		println(snippet.toString())






	}




}