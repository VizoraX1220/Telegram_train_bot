plugins {
    kotlin("jvm") version "2.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.github.kotlin-telegram-bot:kotlin-telegram-bot:6.0.7")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(16)
}
