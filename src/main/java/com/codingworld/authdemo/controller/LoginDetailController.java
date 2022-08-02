package com.codingworld.authdemo.controller;

import com.codingworld.authdemo.bean.LoginDetails;
import com.codingworld.authdemo.config.LoginConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginDetailController {

  @Autowired
  LoginConfig config;

  @GetMapping(value = "/logindetail")
  public LoginDetails getLoginDetails() {
    return new LoginDetails(config.getLoginurl(), config.getAuthurl());
  }

}
