import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

dependencies{
    // Lang
    compile(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3")

    // JUnit
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.0")

    //mock
    testCompile(group="io.mockk", name= "mockk", version= "1.9.3")
    testCompile(group= "org.mockftpserver", name= "MockFtpServer", version= "2.7.1")

}

repositories {
    mavenCentral()
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
