buildscript {
    val kotlinVersion = "1.6.21"

    repositories {
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        mavenLocal()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

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
    //TODO: get rid of bintray stuff
    if (name.contains("runtime|plugin|target".toRegex())) {
        //TODO bintray upload currently doesn't support gradle metadata uploads (.module files) for now just use maven-publish
//        apply(plugin = "com.jfrog.bintray")
//        //run bintrayUpload or bintrayPublish from command line rather than
////intellij since intellij's process is ignorant of the system env variables
//        configure<com.jfrog.bintray.gradle.BintrayExtension> {
//            user = System.getenv("BINTRAY_USER")
//            key = System.getenv("BINTRAY_KEY")
//            if (name.contains("runtime"))
//                setPublications("jvm", "js", "metadata", "kotlinMultiplatform")
//            else
//                setPublications("mavenJava")
//            publish = true
//            override = true
//            pkg.apply {
//                repo = "piacenti-tools"
//                name = "antlr-kotlin"
//                setLicenses("Apache-2.0")
//                vcsUrl = "https://github.com/piacenti/antlr-kotlin.git"
//                version.apply {
//                    name = versionProperty
//                }
//            }
//        }
        afterEvaluate {
            val repositories = (extensions.findByName("publishing") as? PublishingExtension)?.repositories
            repositories
                    ?.maven {
                        name = "bintray"
                        url = uri("https://api.bintray.com/maven/piacenti/piacenti-tools/antlr-kotlin/;publish=1;override=1")
                        credentials {
                            username = System.getenv("BINTRAY_USER")
                            password = System.getenv("BINTRAY_KEY")
                        }
                    }
        }
    }

//    afterEvaluate {
//
//        println(">>")
//        project.extensions.wi.withType(MavenPublication::class.java) {
//            println(name)
//            name = name
//
//        }
//    }
}

tasks.withType<Wrapper> {
    gradleVersion = "7.4.2"
    distributionType = Wrapper.DistributionType.ALL
}
