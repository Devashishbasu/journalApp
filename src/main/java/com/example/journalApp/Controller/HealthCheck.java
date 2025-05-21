package com.example.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/j")
public class HealthCheck {

  @GetMapping
  public String healthCheck(){
    return "Ok";
  }
}
