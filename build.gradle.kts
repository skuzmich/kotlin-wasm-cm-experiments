plugins {
    kotlin("multiplatform") version "2.0.255-SNAPSHOT"
}

repositories {
    mavenLocal()
    mavenCentral()
}

kotlin {
    wasmWasi {
        binaries.executable()
        nodejs()
    }
}

 tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile>().configureEach {
     kotlinOptions.freeCompilerArgs += listOf(
         "-Xwasm-use-traps-instead-of-exceptions",
         "-language-version", "2.0",
         "-Xwasm-initialize-in-start-function",
     )
 }