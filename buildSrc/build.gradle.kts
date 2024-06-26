plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
}

dependencies {
  implementation("gradle.plugin.org.cadixdev.gradle:licenser:0.6.1")
}

tasks {
  compileKotlin {
    kotlinOptions {
      jvmTarget = "17"
    }
  }
}
