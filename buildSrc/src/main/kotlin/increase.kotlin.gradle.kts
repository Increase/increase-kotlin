import com.diffplug.gradle.spotless.SpotlessExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("increase.java")
    kotlin("jvm")
    id("org.jetbrains.dokka")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

configure<SpotlessExtension> {
    kotlin {
        ktfmt().kotlinlangStyle()
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        allWarningsAsErrors = true
        freeCompilerArgs = listOf("-Xjvm-default=all", "-Xjdk-release=1.8")
        jvmTarget = "1.8"
    }
}

tasks.named<Jar>("javadocJar") {
    from(tasks.named("dokkaHtml"))
}
