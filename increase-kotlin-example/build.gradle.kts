plugins {
    id("increase.kotlin")
    application
}

dependencies {
    implementation(project(":increase-kotlin-core"))
    implementation(project(":increase-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :increase-kotlin-example:run` to run `Main`
    // Use `./gradlew :increase-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.increase.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
