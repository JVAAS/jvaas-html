
val projectVersion = "1.0.3"

group = "io.jvaas"
version = projectVersion
description = "Type-Safe HTML Generator"

repositories {
	mavenLocal()
	jcenter()
}

plugins {
	kotlin("jvm").version("1.4.10")
	maven
	`maven-publish`
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		jvmTarget = "11"
	}
}

dependencies {
	testImplementation(kotlin("test-junit"))
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			groupId = "io.jvaas"
			artifactId = "jvaas-html"
			version = projectVersion

			from(components["java"])
		}
	}
}
