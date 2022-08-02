package com.codingworld.authdemo.bean;

public class LoginDetails {

  private String loginUrl;
  private String authUrl;

  public LoginDetails(String loginUrl, String authUrl) {
    this.authUrl = authUrl;
    this.loginUrl = loginUrl;
  }

  public String getLoginUrl() {
    return loginUrl;
  }

  public void setLoginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
  }

  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }
}
