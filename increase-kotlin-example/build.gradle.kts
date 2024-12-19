plugins {
    id("increase.kotlin")
    application
}

dependencies {
    implementation(project(":increase-kotlin"))
}

application {
    mainClass = "com.increase.api.example.MainKt"
}
