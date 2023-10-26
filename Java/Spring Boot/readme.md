# Spring Boot

Spring Boot is an extension of the Spring framework designed too simplify the 
bootstraping ad development of new Spring applications. The Primary goal of Spring
Boot is to provide a set of default configurations, tools and libraries to start
buiding applications

## Setup

[Spring initializr](https://start.spring.io/)

## How to run from terminal

```bash
$ mvn spring-boot:run
```

## Run from .jar file

```bash
$ mvn clean install
```

```bash
$ java -jar target/project-name-0.0.1-SNAPSHOT.jar
```

## Spring boot Annotations

Annotations have become a prevalent tool for configuration and metada because their
clarity, conscisenes and the way to centralized management.

Advantages:
* Declarative Programming
* Reduction in XML Configuration
* Type Safety
* Centralized Configuration

### @SpringBootApplication Annotation

The `@SpringBootApplication` annotation triggers the automatic scanning of the 
classpath, detects the configurations, and sets up the application accordingly.