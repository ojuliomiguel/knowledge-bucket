package br.com.solidcode42.solidcode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fool")
public class FirstController {
  
  @GetMapping("info")
  public String printInfo() {
    return "Hello, this is a controller";
  }

}
