package br.com.solidcode42.solidcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.solidcode42")
@RestController
public class SolidcodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidcodeApplication.class, args);
	}

@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello, %s", name);
	}

}
