# PasswordEncoder Class

This class is vital for handling password encodig and decoder in a secure manner.

## Use Cases

* Ideal for hashing passwords before storing them.
* EnsureS that passwords are note store in plain text.

## Example

```java
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}

public void registerUser(String username, String rawPassword) {
    String encodedPassword = passwordEncoder().encode(rawPassword);
}
```

We need to use `@Bean` annotation to use PasswordEncoder. 
ByCrypt is widely ysed method for password hashing.