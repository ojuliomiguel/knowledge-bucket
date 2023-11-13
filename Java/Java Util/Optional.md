# Optional

From JDK 8, the classes named Optional, OptionalDouble, and OptionalInt offer a way to handle situations where a value may or may not be present. This approach solves the problem of frequent checks for null values.

```java
 Optional<String> optionalString = Optional.of("Hello, World!");
  // Check if value is present
  if (optionalString.isPresent()) {
    System.out.println(optionalString.get());
  } else {
    System.out.println("No value present");
  }
  // Using lambda expression
  optionalString.ifPresent(s -> System.out.println(s));
```
