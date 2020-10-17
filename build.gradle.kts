import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.persephone"
version = "1.0.0"

repositories {
	mavenLocal()
	mavenCentral()
	jcenter()
}

plugins {
	kotlin("jvm") version ("1.4.10")
	`maven-publish`
}

java {
	sourceCompatibility = JavaVersion.VERSION_11
	targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		jvmTarget = "11"
	}
}

tasks.named<Test>("test") {
	useJUnitPlatform()
}

dependencies {

	// build
	compile(kotlin("stdlib-jdk8"))

	// test
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.1.0")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.1.0")

	// logging
	compile("org.slf4j:slf4j-api:1.7.28")

}

publishing {
	publications {
		create<MavenPublication>("maven") {
			groupId = "io.persephone"
			artifactId = "dsl"
			version = "1.0.1"
		}
	}
}
