import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.script.lang.kotlin.extra

buildscript {
  val springBootVersion = properties["springBootVersion"] as String
  val kotlinVersion = properties["kotlinVersion"] as String

  repositories {
    jcenter()
  }

  dependencies {
    classpath(kotlinModule("gradle-plugin", kotlinVersion))
    classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
  }
}

subprojects {
  val kotlinVersion = properties["kotlinVersion"] as String

  repositories {
    mavenCentral()
    maven { setUrl("https://repo.spring.io/milestone") }
    maven { setUrl("https://repo.spring.io/snapshot") }
  }

  apply {
    plugin("org.jetbrains.kotlin.jvm")
    plugin("kotlin")
  }

  dependencies {
    compile(kotlinModule("reflect", kotlinVersion))
  }

  tasks.withType<KotlinCompile> {
    kotlinOptions {
      jvmTarget = "1.8"
    }
  }
}