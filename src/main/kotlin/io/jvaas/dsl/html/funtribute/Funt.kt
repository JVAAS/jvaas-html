package io.jvaas.dsl.html.funtribute

import io.jvaas.dsl.html.Element
import io.jvaas.dsl.html.Resource

interface Funt {
	val resources: MutableList<Resource>?
	val children: MutableList<Element>
}