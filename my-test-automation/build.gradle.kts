plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.28.1")
    implementation("org.testng:testng:7.10.2")
    implementation("io.appium:java-client:9.2.2")
    implementation("org.seleniumhq.selenium:selenium-java:4.20.0")
}

tasks.test {
    useJUnitPlatform()
    useTestNG()
}

kotlin {
    jvmToolchain(17)
}