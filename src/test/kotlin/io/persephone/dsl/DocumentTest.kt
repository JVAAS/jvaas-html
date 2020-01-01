package io.persephone.dsl

import io.persephone.dsl.helper.DOCUMENT
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DocumentTest {

	@Test
	fun testFullDocumentDSL() {
		Assertions.assertEquals(

			"""
				<!DOCTYPE html>
				<html>
					<head>
						<meta charset="UTF-8" />
						<title>
							Persephone
						</title>
					</head>
					<body>
						Hello World
					</body>
				</html>	
			""".trimIndent().trim(),

			DOCUMENT({
				meta(charset = "UTF-8")
			}, {
				+"Hello World"
			}).apply {
				title = "Persephone"
			}.toString().trim()

		)
	}

	@Test
	fun testFullDocumentClass() {

		Assertions.assertEquals(

			"""
				<!DOCTYPE html>
				<html>
					<head>
						<meta charset="UTF-8" />
						<title>
							Persephone
						</title>
					</head>
					<body>
						Hello World
					</body>
				</html>
			""".trimIndent().trim(),

			DOCUMENT().apply {
				html.head {
					meta(charset = "UTF-8")
					title {
						+"Persephone"
					}
				}
				html.body {
					+"Hello World"
				}
			}.toString().trim()

		)


	}


}