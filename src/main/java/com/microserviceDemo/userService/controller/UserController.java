package com.microserviceDemo.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserviceDemo.userService.model.User;
import com.microserviceDemo.userService.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping("/")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

}
