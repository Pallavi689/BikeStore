package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.Users;
import com.login.service.UserService;

@RestController
public class UsersController {
	
	@Autowired
	UserService userService;
	
  @PostMapping("/addUser")
//  addUser is a endpoints 
  
//  @RequestBody -> get data as a json format form pojo class pass as a parameter
  public Users addUser(@RequestBody Users user) {
	  return userService.addUser(user);
	  //save data in a database 
  }
}
