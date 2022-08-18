package com.microservice.demo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.demo.user.model.User;
import com.microservice.demo.user.repository.UserRepository;

@Service
public class userService {
	
	@Autowired
	UserRepository userRepo;
	
	public User saveUser(User user) {
		User lastedUser = userRepo.save(user);
		return lastedUser;
	}

	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return userRepo.findUserById(userId);
	}

	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
