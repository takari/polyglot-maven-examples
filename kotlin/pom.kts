project {
    name = "Polyglot :: Kotlin"
    groupId = "io.takari.polyglot"
    artifactId = "regular-project"
    version = "0.3.3-SNAPSHOT"
    packaging = jar

    val junitVersion = 4.12
    val kotlinVersion = "1.1.61"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
        compile("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.0")
                .exclusions("org.jetbrains.kotlin:kotlin-stdlib")

        test(
                "junit:junit:$junitVersion" exclusions "org.hamcrest:hamcrest-core",
                "org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion"
        )
    }
}
