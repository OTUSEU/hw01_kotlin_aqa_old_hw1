/**
 * почему-то отсутствует у слушателя  файл
 * build.gradle.kts
 * без него по-моему ничего собираться и  работать не будет
 * Добавил шаблонный файл
 *
 * Все задание загнано в ветку test, разумнее поместить в main
 * Ветка тест не очень подходит и обрабатывается IntellJ по особенному
 * хотя и так работает- переносить не стал
 */

plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.20")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}