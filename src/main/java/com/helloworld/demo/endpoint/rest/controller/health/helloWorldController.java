package com.helloworld.demo.endpoint.rest.controller.health;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;

public class helloWorldController {
  @GetMapping("/hello")
  public Map<String, String> hello() {
    return Map.of("Message", "hello world !!");
  }
}
