package com.elasticsearch.dto;

import java.util.List;

import javax.validation.constraints.Email;

import com.elasticsearch.custom.annotation.ValidPassword;
import com.elasticsearch.model.Role;

import io.swagger.annotations.ApiModelProperty;

public class UserDataDTO {
  
  @ApiModelProperty(position = 0)
  private String username;
  @ApiModelProperty(position = 1)
  @Email(message="inValid email")
  private String email;
  @ApiModelProperty(position = 2)
  @ValidPassword(message="invalid Password")
  private String password;
  @ApiModelProperty(position = 3)
  List<Role> roles;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

}
