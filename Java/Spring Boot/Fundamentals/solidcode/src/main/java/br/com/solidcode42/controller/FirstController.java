package br.com.solidcode42.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.solidcode42.DTO.InfoDto;

@RestController
@RequestMapping("/fool")
public class FirstController {

  @GetMapping("info/{name}")
  public String printInfo(@PathVariable String name) {
    return "Hello, this is a controller,  %s".formatted(name);
  }

  @GetMapping("queryinfos")
  public String queryInfo(@RequestParam String easterEgg) {
    if (easterEgg != null) {
      return "%s".formatted(easterEgg);
    }

    return "";
  }

  @GetMapping("allqueries")
  public String queryInfo(@RequestParam Map<String, String> allParams) {
    return "%s".formatted(allParams.entrySet());
  }

  @PostMapping("/infos")
  public String receiveInfos(@RequestBody InfoDto body) {
    return "Information sent %s %s".formatted(body.name(), body.age());
  }

}
