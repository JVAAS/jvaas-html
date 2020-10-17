
val projectVersion = "1.0.1"

group = "io.jvaas"
version = projectVersion
description = "Type-Safe HTML Generator"

repositories {
	mavenLocal()
	jcenter()
}

plugins {
	kotlin("multiplatform").version("1.4.10")
	maven
	`maven-publish`
}

kotlin {
	jvm {
		compilations.all {
			kotlinOptions.jvmTarget = "11"
		}
	}
	sourceSets {
		val jvmMain by getting {
			dependencies {

			}
		}
		val jvmTest by getting {
			dependencies {
				implementation(kotlin("test-junit"))
			}
		}
	}
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			groupId = "io.jvaas"
			artifactId = "jvaas-html"
			version = projectVersion
		}
	}
}
