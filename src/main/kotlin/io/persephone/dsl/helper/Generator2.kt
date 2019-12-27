package io.persephone.dsl.helper


class HtmlDslGenerator {

	val root: Grouping

	init {

		 root = Grouping(tag = "document") document@{
			grouping(tag = "html") html@{

				grouping(tag = "head") head@{
					element(tag = "base", attributes = listOf("href", "target"))
					element(tag = "link", attributes = listOf("rel", "type", "href"))
					element(tag = "meta", attributes = listOf("charset", "name", "content"))
					element(tag = "style", attributes = listOf("type", "media", "nonce", "title"))
					element(tag = "title", attributes = listOf())
				}

				grouping(tag = "body") body@{

					grouping(tag = "div", children = this@body.children)
					grouping(tag = "span", children = this@body.children)

					grouping(tag = "table") table@{

						element(tag = "caption")

						grouping(tag = "colgroup") colgroup@{
							element(tag = "col")
						}

						grouping(tag = "tr") tr@{
							grouping(tag = "td", children = this@body.children)
						}

						grouping(tag = "thead") thead@{
							grouping(tag = "tr") tr@{
								grouping(tag = "th", children = this@body.children)
							}
						}
						grouping(tag = "tbody") tbody@{
							grouping(tag = "tr") tr@{
								grouping(tag = "td", children = this@body.children)
							}
						}
						grouping(tag = "tfoot") tfoot@{
							grouping(tag = "tr") tr@{
								grouping("td", children = this@body.children)
							}
						}
					}
				}
			}
		}
	}

	companion object {

		@JvmStatic
		fun main(args: Array<String>) {

			val root = HtmlDslGenerator()

			println(root)

		}
	}

	private fun getPath(): String {
		return this::class.java.protectionDomain.codeSource.location.path.replace("/build/classes/kotlin/main/", "")
	}

	private fun String.toCamelCase(): String {
		val array = this.toByteArray()
		if (array.isNotEmpty()) {
			array[0] = array.first().toChar().toUpperCase().toByte()
		}
		return String(array)
	}

}

