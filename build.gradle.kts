import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.persephone"
version = "1.0.0"

repositories {
	mavenCentral()
	jcenter()
}

plugins {
	kotlin("jvm") version ("1.3.61")
}

java {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		jvmTarget = "1.8"
		freeCompilerArgs = listOf("-Xmx=4096m")
	}
}


dependencies {

	// build
	compile(kotlin("stdlib-jdk8"))

	// test
	testCompile(group = "org.junit.jupiter", name = "junit-jupiter-api", version = "5.3.1")

	// logging
	compile(group = "org.slf4j", name = "slf4j-api", version = "1.7.28")

}
