rootProject.name = "increase-kotlin-root"

val projectNames = rootDir.listFiles()
    ?.asSequence()
    .orEmpty()
    .filter { file ->
        file.isDirectory &&
        file.name.startsWith("increase-kotlin") &&
        file.listFiles()?.asSequence().orEmpty().any { it.name == "build.gradle.kts" }
    }
    .map { it.name }
    .toList()
println("projects: $projectNames")
projectNames.forEach { include(it) }
