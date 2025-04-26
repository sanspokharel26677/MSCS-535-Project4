plugins {
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
    id("java")
}

group = "com.sandesh"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    // Spring Boot Web for REST APIs
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Thymeleaf for frontend
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

    // Spring Security for TLS/HTTPS and future enhancements
    implementation("org.springframework.boot:spring-boot-starter-security")

    // Logging
    implementation("org.springframework.boot:spring-boot-starter-logging")

    // Testing
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}