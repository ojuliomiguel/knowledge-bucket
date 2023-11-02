# Notes and codes about the book Spring in Action 6

> This book treats Spring and Spring Boot as if they were one and the same.

## What is Spring?

Any nontrivial application comprises many components, each responsbile for its own piece
if the overall application functionality, coordinating with the other application elements
to get the job done.

Spring offers a container (Spring application contexts) that creates and manages applications components (or beans).

The act of wiring beans together is based on a pattern known as dependecy injection (DI).

On the top of its core container, Spring and a full of related libraries offer a webframework.

> Application Components are managed and injected into each other by the Spring application context
<img src="https://drek4537l1klr.cloudfront.net/walls8/HighResolutionFigures/figure_1-1.png" width="700">

The bellow xml code declares two beans. InventoryService bean and ProductService bean wires the InventoryService
into ProductService via a constructor argument.

```xml
<bean id="inventoryService"
      class="com.example.InventoryService" />

<bean id="productService"
      class="com.example.ProductService" >
  <constructor-arg ref="inventoryService" />
</bean>
```

In the modern Spring, we use @annotations

```java
@Configuration
public class ServiceConfiguration {
  @Bean
  public InventoryService inventoryService() {
    return new InventoryService();
  }

  @Bean
  public ProductService productService() {
    // Injection here
    return new ProductService(inventoryService());
  }
}
```

The configurations's methods are annotated with @Beans - the objects they return
should be added as beans in the application context (their respective bean IDs will 
be the same as the names of the methods that define then).

Autowiring and component scanning: We don't need use explicit configurations. 
Spring can automatically discover components from an application's casspath and create 
them as beans in the Spring application context.

