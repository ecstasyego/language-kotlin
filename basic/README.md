## Keywords

- by lazy, lateinit
- const
- object, class
- inner
- abstract, interface
- suspend, async, await, launch, runBlocking
- Thread, runnable, run

## Build

`build.gradle.kts`
```kotlin
import java.io.File

plugins {
    kotlin("jvm") version "1.8.0"
}

repositories {
    mavenCentral() // ~/.m2/repository/
}

dependencies {
    implementation(kotlin("stdlib-jdk8")) // ~/.gradle/caches/
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.0") // import kotlinx.coroutines.*
}

sourceSets {
    main {
        kotlin {
            setSrcDirs(setOf(File("src/main/kotlin"))) // PATH: src/main/kotlin
        }
    }
}

tasks.register<JavaExec>("run") {
    mainClass.set("MainKt") // FILE: Main.kt [NOTE: The first word of file name must be an upper case.]
    classpath = sourceSets["main"].runtimeClasspath
}
```
