import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val projectVersion = "1.0.1"

group = "io.jvaas"
version = projectVersion
description = "Type-Safe HTML Generator"

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

plugins {
	kotlin("jvm") version ("1.4.10")
	`maven-publish`
}

repositories {
	mavenLocal()
	jcenter()
}


tasks.withType<KotlinCompile> {
	kotlinOptions {
		jvmTarget = "11"
	}
}

dependencies {
	testImplementation(group = "junit", name = "junit", version = "4.12")
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
