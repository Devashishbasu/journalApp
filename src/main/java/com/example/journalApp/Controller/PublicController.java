package com.example.journalApp.Controller;

import com.example.journalApp.entity.User;
import com.example.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/public")
public class PublicController {

  @Autowired
  private UserService userService;

  @GetMapping("/health-check")
  public String healthCheck(){
    return "OK";
  }

  @PostMapping("/create-user")
  public void createUser(@RequestBody User user){
    userService.saveNewUser(user);
  }
}
