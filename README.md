# Persephone Unframework DSL

## Flexible HTML DSL Generator

See HtmlDslGenerator.kt which can be used to keep the DSL up to date with the latest HTML specification.
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
    
    