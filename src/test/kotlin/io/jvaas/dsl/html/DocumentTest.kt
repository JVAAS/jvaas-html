package io.jvaas.dsl.html

import io.jvaas.dsl.html.helper.DOCUMENT
import org.junit.Test
import kotlin.test.assertEquals

class DocumentTest {

	@Test
	fun testFullDocumentDSL() {
		assertEquals(

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

		assertEquals(

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