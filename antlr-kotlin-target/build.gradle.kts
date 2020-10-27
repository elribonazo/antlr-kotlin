plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    api("org.antlr:antlr4:${Versions.antlr}")
}
tasks.register("sourcesJar", Jar::class.java) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}
artifacts {
    archives(tasks.named("sourcesJar"))
}
publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
            artifact(tasks.named("sourcesJar"))
        }
    }
}
