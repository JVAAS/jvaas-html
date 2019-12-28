package io.persephone.dsl.helper


class HtmlDslGenerator {

	val root: Grouping

	init {

		root = Grouping(tag = "document") document@{
			grouping(tag = "html") html@{

				/**
				 * Document metadata
				 * Metadata contains information about the page. This includes information about styles, scripts
				 * and data to help software (search engines, browsers, etc.) use and render the page. Metadata for
				 * styles and scripts may be defined in the page or link to another file that has the information.
				 */
				val head = grouping(tag = "head") head@{
					val base = element(tag = "base", attributes = listOf("href", "target"), selfClosing = true)
					val link = element(tag = "link", attributes = listOf("rel", "type", "href"), selfClosing = true)
					val meta = element(tag = "meta", attributes = listOf("charset", "name", "content"), selfClosing = true)
					val style = element(tag = "style", attributes = listOf("type", "media", "nonce", "title"))
					val title = element(tag = "title", attributes = listOf())
				}

				/**
				 * Sectioning root
				 */
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

					/**
					 * Text content
					 * Use HTML text content elements to organize blocks or sections of content placed between the
					 * opening <body> and closing </body> tags. Important for accessibility and SEO, these elements
					 * identify the purpose or structure of that content.
					 */
					val blockquote = grouping(tag = "blockquote", children = this@body.children)

					val dt = element(tag = "dt")
					val dd = element(tag = "dd")
					val dl = grouping(tag = "dl", children = mutableListOf(
						dt, dd
					))

					val div = grouping(tag = "div", children = this@body.children)

					val figcaption = element(tag = "figcaption")
					val figure = grouping(tag = "figure", children = this@body.children)

					val hr = element(tag = "hr", selfClosing = true)

					val li = grouping(tag = "li")



					val span = grouping(tag = "span", children = this@body.children)

					/**
					 * Inline text semantics
					 * Use the HTML inline text semantic to define the meaning, structure, or style of a word,
					 * line, or any arbitrary piece of text.
					 */


					/**
					 * Image and multimedia
					 * HTML supports various multimedia resources such as images, audio, and video.
					 */


					/**
					 * Embedded content
					 * In addition to regular multimedia content, HTML can include a variety of other content,
					 * even if it's not always easy to interact with.
					 */


					/**
					 * Scripting
					 * 	In order to create dynamic content and Web applications, HTML supports the use of scripting
					 * 	languages, most prominently JavaScript. Certain elements support this capability.
					 */


					/**
					 * Demarcating edits
					 * These elements let you provide indications that specific parts of the text have been altered.
					 */


					/**
					 * Table content
					 * The elements here are used to create and handle tabular data.
					 */


					/**
					 * Forms
					 * HTML provides a number of elements which can be used together to create forms which the user
					 * can fill out and submit to the Web site or application. There's a great deal of further
					 * information about this available in the HTML forms guide.
					 */

					/**
					 * Interactive elements
					 * HTML offers a selection of elements which help to create interactive user interface objects.
					 */

					/**
					 * Web Components
					 * Web Components is an HTML-related technology which makes it possible to, essentially,
					 * create and use custom elements as if it were regular HTML. In addition, you can create
					 * custom versions of standard HTML elements.
					 */




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

