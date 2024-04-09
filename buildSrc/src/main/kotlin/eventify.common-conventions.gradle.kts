plugins {
  `java-library`
}

repositories {
  mavenLocal()
  maven("https://repo.papermc.io/repository/maven-public/")
  maven("https://repo.unnamed.team/repository/unnamed-public/")
  mavenCentral()
}

dependencies {
  // server api
  compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")

  testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}

java {
  withSourcesJar()
  withJavadocJar()
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
  }
}

tasks {
  javadoc {
    isFailOnError = true
  }

  test {
    useJUnitPlatform()
  }
}
