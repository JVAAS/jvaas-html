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

					/**
					 * Content sectioning
					 *
					 * Content sectioning elements allow you to organize the document content into logical pieces.
					 * Use the sectioning elements to create a broad outline for your page content, including header
					 * and footer navigation, and heading elements to identify sections of content.
					 */
					val address = grouping(tag = "address", children = this@body.children)
					val article = grouping(tag = "article", children = this@body.children)
					val aside = grouping(tag = "aside", children = this@body.children)
					val footer = grouping(tag = "footer", children = this@body.children)
					val header = grouping(tag = "header", children = this@body.children)
					val h1 = element(tag = "h1")
					val h2 = element(tag = "h2")
					val h3 = element(tag = "h3")
					val h4 = element(tag = "h4")
					val h5 = element(tag = "h5")
					val h6 = element(tag = "h6")
					val hgroup = grouping(tag = "hgroup", children = mutableListOf(
						h1, h2, h3, h4, h5, h6
					))
					val main = grouping(tag = "main", children = this@body.children)
					val nav = grouping(tag = "nav", children = this@body.children)
					val section = grouping(tag = "section", children = this@body.children)









					val div = grouping(tag = "div", children = this@body.children)
					val span = grouping(tag = "span", children = this@body.children)

					/*
					val table = grouping(tag = "table") table@{

						val caption = element(tag = "caption")

						val colgroup = grouping(tag = "colgroup") colgroup@{
							val col = element(tag = "col")
						}

						val tr = grouping(tag = "tr") tr@{
							val td = grouping(tag = "td", children = this@body.children)
						}

						val thead = grouping(tag = "thead") thead@{
							val tr = grouping(tag = "tr") tr@{
								val th = grouping(tag = "th", children = this@body.children)
							}
						}

						val tbody = grouping(tag = "tbody") tbody@{
							val tr = grouping(tag = "tr") tr@{
								val td = grouping(tag = "td", children = this@body.children)
							}
						}

						val tfoot = grouping(tag = "tfoot") tfoot@{
							val tr = grouping(tag = "tr") tr@{
								val td = grouping("td", children = this@body.children)
							}
						}
					}

					 */
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

