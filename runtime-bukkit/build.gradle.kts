import org.gradle.configurationcache.extensions.capitalized
import java.util.*

plugins {
  id("eventify.common-conventions")
  id("com.github.johnrengelman.shadow") version "8.1.1"
  id("net.minecrell.plugin-yml.paper") version "0.6.0"
}

dependencies {
  // event-controller dependencies
  implementation(project(":eventify-api"))
  implementation(libs.storage.gson)
}

paper {
  val projectName = rootProject.name.split("-").joinToString("") { it.capitalized() }
  val pluginName = "Emptyte$projectName"

  name = pluginName
  version = rootProject.version.toString()
  description = "Emptyte $projectName plugin."

  main = "team.emptyte.${projectName.lowercase(Locale.ROOT)}.${pluginName}Plugin"
  apiVersion = "1.20"

  authors = listOf("SrVenient")
  website = "https://emptyte.org"
}

tasks {
  shadowJar {
    archiveBaseName.set(rootProject.name)
    archiveClassifier.set("")
  }
}
