package com.microservice.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.demo.user.model.User;
import com.microservice.demo.user.service.userService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class userController {
	
	@Autowired
	userService userService;
	
	@GetMapping("/")
	public Iterable<User> getUser() {
		return userService.findAll();
	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
//		log.info("save new user");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") int userId) {
		return userService.findUserById(userId);
	}

}
