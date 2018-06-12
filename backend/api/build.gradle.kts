plugins {
  id("org.jetbrains.kotlin.plugin.spring") version "1.2.41"
}

apply {
  plugin("org.springframework.boot")
}

dependencies {
  compile("org.springframework.boot:spring-boot-starter:2.0.2.RELEASE")
  compile(project(":backend:component"))
}
