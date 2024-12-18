plugins {
	java
	application
	eclipse
    id("com.diffplug.spotless") version "6.25.0"
    id("com.adarshr.test-logger") version "4.0.0"
    id("io.freefair.lombok") version "8.6"
	id("io.spring.dependency-management") version "1.1.6"
	id("org.springframework.boot") version "3.4.0"
}

apply(plugin = "io.spring.dependency-management")

group = "com.codedifferently"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
    implementation("com.clerk:backend-api:1.4.0")
    implementation("com.google.code.gson:gson:2.11.0")
	implementation("org.json:json:20240303")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("redis.clients:jedis:5.2.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

// Define Node.js tasks
val npmInstall by tasks.registering(Exec::class) {
    workingDir = file("src/main/frontend")
    commandLine("npm", "install")
}

val npmBuild by tasks.registering(Exec::class) {
    dependsOn(npmInstall)
    workingDir = file("src/main/frontend")
    commandLine("npm", "run", "build")
}

val copyReactBuild by tasks.registering(Copy::class) {
    dependsOn(npmBuild)
    from("src/main/frontend/dist")
    into("src/main/resources/react-static")
}

// Hook into the Gradle build lifecycle
tasks.named("processResources") {
    dependsOn(copyReactBuild)
}