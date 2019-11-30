package io.persephone.dsl.element

import io.persephone.dsl.HeadTag
import io.persephone.dsl.BodyTag

class INPUT : BodyTag("input") {

	var clazz: String
		get() = attributes.getOrDefault("clazz", "")
		set(value) {
			attributes["clazz"] = value
		}

	var style: String
		get() = attributes.getOrDefault("style", "")
		set(value) {
			attributes["style"] = value
		}

	var autocomplete: String
		get() = attributes.getOrDefault("autocomplete", "")
		set(value) {
			attributes["autocomplete"] = value
		}

	var autofocus: String
		get() = attributes.getOrDefault("autofocus", "")
		set(value) {
			attributes["autofocus"] = value
		}

	var disabled: String
		get() = attributes.getOrDefault("disabled", "")
		set(value) {
			attributes["disabled"] = value
		}

	var form: String
		get() = attributes.getOrDefault("form", "")
		set(value) {
			attributes["form"] = value
		}

	var list: String
		get() = attributes.getOrDefault("list", "")
		set(value) {
			attributes["list"] = value
		}

	var name: String
		get() = attributes.getOrDefault("name", "")
		set(value) {
			attributes["name"] = value
		}

	var readonly: String
		get() = attributes.getOrDefault("readonly", "")
		set(value) {
			attributes["readonly"] = value
		}

	var required: String
		get() = attributes.getOrDefault("required", "")
		set(value) {
			attributes["required"] = value
		}

	var tabindex: String
		get() = attributes.getOrDefault("tabindex", "")
		set(value) {
			attributes["tabindex"] = value
		}

	var type: String
		get() = attributes.getOrDefault("type", "")
		set(value) {
			attributes["type"] = value
		}

	var value: String
		get() = attributes.getOrDefault("value", "")
		set(value) {
			attributes["value"] = value
		}

}

