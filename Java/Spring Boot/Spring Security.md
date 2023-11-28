# Spring Security framework

With Spring Security we can providing autentication and authorization to our java
application.

In the example below, we configure a @Bean `SecurityFilterChain` to manage Cross-Site Request Forgery (CSRF) protection. The `authorizeHttpRequests` method configures authorizations for HTTP requests. Finally, the method builds and returns the securityFilterChain object configured by the `HttpSecurity` instance

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
The CSRF disabled is commom in API where clients are not the web browsers.

## Custom Filter

To income requests we can add a custom filter:

```java
//...

http.csrf(csrf -> csrf.disable())
      .authorizeHttpRequests(auth -> {
        //...
      }).addFilterBefore(securityFilter, BasicAuthenticationFilter.class);
```

## OncePerRequestClassFilter

In the above example about custom filter, in method `addFilterBefore` we have added
security filter instance. This class extendes `OncePerRequestClassFilter` that ensure
a single execution per request dispatch.
Our classe SecurityFilter checks and validate JWT Token incoming of requests.

```java
@Component
public class SecurityFilter extends OncePerRequestFilter {

  @Autowired
  private JWTProvider jwtProvider;

  @Override
  protected void doFilterInternal(
      HttpServletRequest request,
      HttpServletResponse response,
      FilterChain filterChain) throws ServletException, IOException {
    SecurityContextHolder.getContext().setAuthentication(null);
    String header = request.getHeader("Authorization");

    if (header != null) {
      String subjectToken = this.jwtProvider.validateToken(header);
      if (subjectToken.isEmpty()) {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return;
      }

      request.setAttribute("company_id", subjectToken);
      UsernamePasswordAuthenticationToken auth = 
        new UsernamePasswordAuthenticationToken(
          subjectToken,
          null,
          Collections.emptyList()
        );

      SecurityContextHolder.getContext().setAuthentication(auth);
    }

    filterChain.doFilter(request, response);
  }

}
```