package com.microservice.demo.user.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.microservice.demo.user.model.User;

public interface UserRepository extends CrudRepository<User, String> {	
	Optional<User> findUserByUsername(String username);

	User findUserById(int userId);
}
