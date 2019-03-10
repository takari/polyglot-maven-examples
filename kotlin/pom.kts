project("Polyglot :: Kotlin") {

    groupId = "io.takari.polyglot"
    artifactId = "regular-project"
    version = "0.3.3-SNAPSHOT"

    val junitVersion = 4.12
    val kotlinVersion = "1.1.61"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
        compile("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.0")
            .exclusions("org.jetbrains.kotlin:kotlin-stdlib")

        test("junit:junit:$junitVersion").exclusions("org.hamcrest:hamcrest-core")
        test("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
    }

    build {
        // Inline execution
        execute(id = "hello", phase = "validate") {
            log.info("Hello, from ${project.name}")
        }

        // External script execution
        execute(id = "hello-script", phase = "validate", script = "src/build/scripts/Hello.kts")

        sourceDirectory = "src/main/kotlin"
        testSourceDirectory = "/src/test/kotlin"

        pluginManagement {
            plugins {
                plugin("org.jetbrains.kotlin:kotlin-maven-plugin:${kotlinVersion}") {
                    executions {
                        execution(id = "compile", goals = listOf("compile"))
                        execution(id = "test-compile", goals = listOf("test-compile"))
                    }
                }
                plugin("org.apache.maven.plugins:maven-jar-plugin") {
                    configuration {
                        "archive" {
                            "index" to true
                            "manifest" {
                                "addClasspath" to true
                                "mainClass" to "org.polyglot.kotlin.sample.Main"
                            }
                            "manifestEntries" {
                                "mode" to "development"
                                "url" to "\${project.url}"
                            }
                        }
                    }
                }
            }
        }
    }
}
