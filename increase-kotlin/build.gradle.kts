plugins {
    id("increase.kotlin")
    id("increase.publish")
}

dependencies {
    api(project(":increase-kotlin-client-okhttp"))
}
