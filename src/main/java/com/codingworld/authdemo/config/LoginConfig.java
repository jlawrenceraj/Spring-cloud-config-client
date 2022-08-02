package com.codingworld.authdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("auth-demo")
public class LoginConfig {

  private String loginurl;
  private String authurl;

  public String getLoginurl() {
    return loginurl;
  }

  public void setLoginurl(String loginurl) {
    this.loginurl = loginurl;
  }

  public String getAuthurl() {
    return authurl;
  }

  public void setAuthurl(String authurl) {
    this.authurl = authurl;
  }
}
