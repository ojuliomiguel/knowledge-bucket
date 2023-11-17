# Spring security

In our pom.xml application we must add the security depedency to start use it.
By default spring boot uses on application start-up and generate a password to using
during development

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

> Generated password

![Alt text](./assets/spring-security-gen-pwd.png)
