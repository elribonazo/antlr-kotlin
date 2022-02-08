buildscript {
    val kotlinVersion = "1.6.10"

    repositories {
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        mavenLocal()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.6.10")
        classpath("io.github.gradle-nexus:publish-plugin:1.0.0")
    }
}


apply(plugin = "io.github.gradle-nexus.publish-plugin")

// a small hack: the variable must be named like the property
// jitpack will pass -Pversion=..., so `val version` is required here.
val version: String by project
// we create an alias here...
val versionProperty = version
// do the same for group
val group: String by project
val groupProperty = if (group.endsWith(".antlr-kotlin")) {
    group
} else {
    // just another jitpack hack
    "$group.antlr-kotlin"
}

allprojects {
    apply(plugin = "org.jetbrains.dokka")
    apply(plugin = "maven-publish")
    apply(plugin = "signing")
    // ... because `version` is another var here.
    // when version is hardcoded here, jitpack can not overwrite it.
    // the default version can now be changed in gradle.properties
    version = versionProperty
    group = groupProperty

    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
        options.compilerArgs.add("-Xlint:all")
        options.isDeprecation = true
    }

    repositories {
        mavenCentral()
        mavenLocal()
    }
    if (name.contains("runtime|plugin|target".toRegex())) {
        val dokkaHtml by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class)
        val javadocJar: TaskProvider<Jar> by tasks.registering(Jar::class) {
            dependsOn(dokkaHtml)
            archiveClassifier.set("javadoc")
            from(dokkaHtml.outputDirectory)
        }
        configure<PublishingExtension> {
            publications.withType<MavenPublication> {
                artifact(javadocJar)
                pom {
                    name.set(groupProperty + ":" + project.name)
                    // optionally artifactId can be defined here
                    description.set("Kotlin multiplatform port of ANTLR")
                    url.set("https://github.com/piacenti/antlr-kotlin")

                    scm {
                        connection.set("scm:git:git://github.com/piacenti/antlr-kotlin.git")
                        developerConnection.set("scm:git:ssh://github.com/piacenti/antlr-kotlin.git")
                        url.set("https://github.com/piacenti/antlr-kotlin/tree/main")
                    }

                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }

                    developers {
                        developer {
                            name.set("Gabriel Piacenti")
                            email.set("piacenti10@gmail.com")
                        }
                    }
                }
                the<SigningExtension>().sign(this)
            }

        }
    }
    configure<SigningExtension> {
        val signingKey = System.getenv("SIGNING_KEY")
        val signingPassword = System.getenv("SIGNING_PASSWORD")
        useInMemoryPgpKeys(signingKey, signingPassword)
    }
}



configure<io.github.gradlenexus.publishplugin.NexusPublishExtension> {
    repositories {
        sonatype {
            username.set(System.getenv("OSSR_TOKEN_ID"))
            password.set(System.getenv("OSSR_TOKEN_VALUE"))
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
        }
    }
}
tasks.withType<Wrapper> {
    gradleVersion = "7.3.3"
    distributionType = Wrapper.DistributionType.ALL
}
afterEvaluate {
    tasks.register("publishToCentral") {
        group = "publishing"
        description = "Publish to Maven Central"
        finalizedBy("publishAllPublicationsToSonatypublishAllPublicationsToSonatypeRepositorypeRepository", "closeAndReleaseSonatypeStagingRepository")
    }
}