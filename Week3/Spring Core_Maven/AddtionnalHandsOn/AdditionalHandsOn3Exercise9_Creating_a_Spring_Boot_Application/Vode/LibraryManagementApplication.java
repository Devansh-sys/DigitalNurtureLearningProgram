package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main entry point for the Library Management Spring Boot application.
 * The @SpringBootApplication annotation enables key features:
 * - @EnableAutoConfiguration: Automatically configures the application based on JAR dependencies.
 * - @ComponentScan: Scans the current package and its sub-packages for components like controllers and repositories.
 * - @Configuration: Allows registering extra beans in the context or importing additional configuration classes.
 */
@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {
        // This static method call bootstraps and launches the Spring application.
        SpringApplication.run(LibraryManagementApplication.class, args);
    }
}
