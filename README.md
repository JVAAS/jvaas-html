# Persephone Unframework DSL

## Flexible HTML DSL Generator

See [HtmlDslGenerator.kt](https://github.com/persephone-unframework/dsl/blob/master/src/main/kotlin/io/persephone/dsl/helper/HtmlDslGenerator.kt) which can be used to keep the DSL up to date with the latest HTML specification.
The DSL aims to follow https://developer.mozilla.org/en-US/docs/Web/HTML/Element as closely as possible

Adding Bootstrap, Foundation, Angular or other framework related attributes / elements now becomes easy, just add them 
to the specification and generate an updated DSL that supports your use-case.

## Flexible HTML DSL

    DOCUMENT({
        meta(charset = "UTF-8")
    }, {
        +"Hello World"
    }).apply {
        title = "Persephone" 
    }

to generate 

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
    
or create snippets that can be reused in multiple places

    val snippet = DIV(classes = "div1", onclick = "clickme()") {
        div(classes = "div2") {
            div {
                div()
            }
            hr()
            span {

            }
        }
        span(classes = "span2") {
            a(href = "#", classes = "a1") {
                +"Hello World"
            }
        }
    }
    
calling `.toString()` on any snippet will give you the relevant HTML, 
in other words or DSL-speak, every HTML element can be a builder.

Standard Kotlin is supported throughout

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

should output

    <div>
        random value = 3
        <span>
            THREE
        </span>
        <ul>
            <li>
                0
            </li>
            <li>
                1
            </li>
            <li>
                2
            </li>
            <li>
                3
            </li>
        </ul>
    </div>
    
## Custom Components

Create custom components either by using the Tag base-class

    class BLAH1(
        init: (BLAH1.() -> Unit)? = null
    ) : Tag(
        tagName = "blah",
        selfClosing = false
    ) {
        operator fun String.unaryPlus() {
            children.add(Text(this))
        }
    }

or by extending an existing element

    class BLAH3(
        init: (BLAH3.() -> Unit)? = null
    ) : DIV(tagName = "blah")

This new element can now be added as an option to existing elements by using an extension function

    fun DIV.blah1(
        classes: String? = null,
        init: (BLAH1.() -> Unit)? = null
    ) {
        this.children.add(BLAH1().apply {
            init?.invoke(this)
        })
    }

which will allow us to do

    DIV(classes = "test") {
        blah1 {
            +"TEST1"
        }
    }
    
and outputs

    <div class="test">
        <blah>
            TEST1
        </blah>
    </div>
    
If you don't override the tagName when extending a `DIV` or set it as 
`"div"` when extending `Tag`, then using this pattern will allow you 
to re-use DSL snippets and still output perfectly valid HTML5

    <div class="test">
        <div>
            TEST1
        </div>
    </div>

## PEBKAC-proof your HTML

Unlike HTML which will allow you to write broken templates like this

    <html>
        <table>
            <div>
            
            </div>
        </table>
    </html>

this DSL will not compile when doing something like this

    HTML {
        table {
            div()
        }
    }
    
due to HTML only allowing a head and body elements.    
    
Although further work is needed here for example to prevent a user from adding multiple
elements where only zero or one elements are expected and more work is needed to either
force the order in which elements can be created or to render them in the correct order.

    html {
        body() {
            table {
                tbody()
                tbody()
                thead()
            }
        }
        head()
        head()
        body()
    }
    
## CSS / JS / IMG Dependencies

A problem in large projects with many components is usually managing static dependencies.
Component `Blah1` might need `blah1.css` and `blah1.js` to render correctly and 
have 20 SVG icons and a large background PNG image.

Persephone Unframework DSL will allow you to either automatically include that CSS / JS / IMG files as 
normal HTML elements `<link rel="stylesheet" href="...">` or give you the option to 
automatically inline it directly in the HTML output.

This gives you the option to optimise for speed or html size. 
Embedding all the CSS and JS directly in a landing page means your page renders instantly 
and JavaScript can execute instantly at the cost of having to download that CSS/JS/IMG 
again when going to another page and losing out on browser caching.
When embedded CSS, JS and images are small, this is an acceptable trade-off and the user 
experience will be that of instant page renders which is typically what you'd want for 
ecommerce pages or blogs.

TODO: insert examples

