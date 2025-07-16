plugins {
    id("increase.kotlin")
    application
}

dependencies {
    implementation(project(":increase-kotlin"))
}

application {
    // Use `./gradlew :increase-kotlin-example:run` to run `Main`
    // Use `./gradlew :increase-kotlin-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "com.increase.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
