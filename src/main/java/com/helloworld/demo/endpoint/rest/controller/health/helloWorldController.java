package com.helloworld.demo.endpoint.rest.controller.health;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
  @GetMapping("/hello")
  public Map<String, String> hello() {
    return Map.of("Message", "hello world !!");
  }
}
