package io.persephone.element

class BUTTON : BodyTag("button") {

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

	var autofocus: String
		get() = attributes.getOrDefault("autofocus", "")
		set(value) {
			attributes["autofocus"] = value
		}

	var autocomplete: String
		get() = attributes.getOrDefault("autocomplete", "")
		set(value) {
			attributes["autocomplete"] = value
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

	var formaction: String
		get() = attributes.getOrDefault("formaction", "")
		set(value) {
			attributes["formaction"] = value
		}

	var formenctype: String
		get() = attributes.getOrDefault("formenctype", "")
		set(value) {
			attributes["formenctype"] = value
		}

	var formmethod: String
		get() = attributes.getOrDefault("formmethod", "")
		set(value) {
			attributes["formmethod"] = value
		}

	var formnovalidate: String
		get() = attributes.getOrDefault("formnovalidate", "")
		set(value) {
			attributes["formnovalidate"] = value
		}

	var formtarget: String
		get() = attributes.getOrDefault("formtarget", "")
		set(value) {
			attributes["formtarget"] = value
		}

	var name: String
		get() = attributes.getOrDefault("name", "")
		set(value) {
			attributes["name"] = value
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

