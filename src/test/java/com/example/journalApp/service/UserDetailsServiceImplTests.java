package com.example.journalApp.service;

import com.example.journalApp.repository.UserRepository;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import static org.mockito.Mockito.when;


public class UserDetailsServiceImplTests {

  @InjectMocks
  private UserDetailsServiceImpl userDetailsService;

  @Mock
  private UserRepository userRepository;

  @BeforeEach
  void setUp(){
    MockitoAnnotations.initMocks(this);
  }


  /*@Test
  void loadUserByUsernameTest(){
    when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(
        User.builder().userName("ram").password("inrinrick").roles(new ArrayList<>()).build());
    UserDetails user = userDetailsService.loadUserByUsername("ram");
    Assertions.assertNotNull(user);
  }*/


}
