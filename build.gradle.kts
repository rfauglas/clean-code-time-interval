plugins {
    java
}

group = "clean.code.samples"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

configurations {
}
val cucumberRuntime by configurations.creating {
    extendsFrom(configurations["testImplementation"])
}

dependencies {
    testImplementation("io.cucumber:cucumber-java8:6.8.1")
    testImplementation("io.cucumber:cucumber-junit:6.8.1")
}

task("cucumber") {
    dependsOn("assemble", "compileTestJava")
    doLast {
        javaexec {
            main = "io.cucumber.core.cli.Main"
            classpath = cucumberRuntime + sourceSets.main.get().output + sourceSets.test.get().output
            args = listOf("--plugin", "pretty", "--glue", "clean.code.samples", "src/test/resources")
        }
    }
}
