rootProject.name = "eventify"

sequenceOf("api", "runtime-bukkit").forEach {
  include("eventify-$it")
  project(":eventify-$it").projectDir = file(it)
}
