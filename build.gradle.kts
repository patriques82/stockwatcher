buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.41"

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
}

allprojects {
  group = "org.stockwatcher"
  version = "1.0-SNAPSHOT"
  repositories {
    jcenter()
  }
}

plugins {
  base
}

dependencies {
  subprojects.forEach {
    archives(it)
  }
}
