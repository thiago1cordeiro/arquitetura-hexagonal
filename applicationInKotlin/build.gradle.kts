import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.spring") version "1.3.72"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {

    compile(project(":domain"))

    // HTTP
    compile("io.javalin:javalin:3.7.0")

    // HTTP client
    implementation(group = "com.github.kittinunf.fuel", name = "fuel", version = "2.2.1")
    // Logging
    compile("org.slf4j:slf4j-api:1.7.30")
    compile("org.slf4j:slf4j-simple:1.7.28")

    // JSON
    compile(group = "com.fasterxml.jackson.module", name = "jackson-module-kotlin", version = "2.10.1")
    compile(group = "com.fasterxml.jackson.core", name = "jackson-databind", version = "2.10.2")
    compile(group = "com.google.code.gson", name = "gson", version = "2.8.6")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
