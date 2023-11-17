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

### @ComponentScan

This annotation tells de Spring container where to look for beans or components
to be auto-wired into the application context, By default, Spring Boot's auto-configuration
scans for components in the current package where de `@SpringBootApplication` is located and its
sub-packages.

### @ControllerAdvice

Its allows you to handle exceptions across the whole application, not just to an individual controller. 
Its like an interceptor of exceptions thrown by methods annotated with `@RequestMapping` and similar.

## Bean

The `@Bean` annotation is an object managed by Spring container. @Bean is usually declared in Java 
class annotated with `@Configuration`.