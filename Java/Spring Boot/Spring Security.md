# Spring Security framework

With Spring Security we can providing autentication and authorization to our java
application.

In this bellow example, we configure a `@Bean` SecurityFilterChain to manager 
Cross-Site Request Forgery (CSRF) protection.
The `authorizeHttpRequests` configures authorizations for HTTP requests.
Finally, the method builds and returns the `securityFilterChain` object configured 
by `HttpSecurity` instance.

```java
@Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.csrf(csrf -> csrf.disable())
      .authorizeHttpRequests(auth -> {
        auth.requestMatchers("/candidate").permitAll()
          .requestMatchers("company").permitAll();
        
        auth.anyRequest().authenticated();
      });
    return http.build();
  }
```