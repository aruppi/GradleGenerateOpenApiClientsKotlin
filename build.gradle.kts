import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.21"
    id("org.openapi.generator") version "7.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // OpenAPI client
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}

// https://dev.to/mariakrol/generate-kotlin-client-for-a-complex-web-api-1gff
val generatedSourcesPath = "${layout.projectDirectory}/apiClient/generated"
val apiDescriptionFile = "${layout.projectDirectory}/swagger.json"
val apiRootName = "aruppi.client"

// https://openapi-generator.tech/docs/generators/kotlin/
openApiGenerate {
    generatorName.set("kotlin")
    inputSpec.set(apiDescriptionFile)
    outputDir.set(generatedSourcesPath)
    apiPackage.set("$apiRootName.api")
    invokerPackage.set("$apiRootName.invoker")
    modelPackage.set("$apiRootName.model")
    configOptions.put("enumPropertyNaming", "PascalCase")
}

kotlin.sourceSets["main"].kotlin.srcDir("$generatedSourcesPath/src/main/kotlin")

tasks.withType<KotlinCompile>().configureEach {
    dependsOn("openApiGenerate")
}
