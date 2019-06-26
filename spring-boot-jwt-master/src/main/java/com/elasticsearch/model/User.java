package com.elasticsearch.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;

import com.elasticsearch.custom.annotation.ValidPassword;


@Component

//Elastic search annotation.
@Document(indexName= "user-test")
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String id;

  @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
  private String username;

  
  private String email;

  @ValidPassword
  private String password;


  List<Role> roles;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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
