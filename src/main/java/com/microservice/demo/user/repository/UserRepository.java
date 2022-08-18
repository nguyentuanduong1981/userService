package com.microservice.demo.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.demo.user.model.User;

public interface UserRepository extends CrudRepository<User, String> {	
	User findUserById(int userId);
}
