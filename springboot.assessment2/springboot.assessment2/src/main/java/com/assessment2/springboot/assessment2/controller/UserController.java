package com.assessment2.springboot.assessment2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessment2.springboot.assessment2.response.ResponseUser;
import com.assessment2.springboot.assessment2.service.UserService;
import com.assessment2.springboot.assessment2.user.User;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/user")
	public ResponseUser addUser(@Valid @RequestBody User user) {
		return this.userservice.addOneUser(user);
	}
	
}
