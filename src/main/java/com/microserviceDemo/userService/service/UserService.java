package com.microserviceDemo.userService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microserviceDemo.userService.model.User;
import com.microserviceDemo.userService.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepo;
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}

}
