package com.peoper.crm.controller;

import java.util.List;
import java.util.Optional;
import java.lang.Iterable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.peoper.crm.model.Users;
import com.peoper.crm.repository.UserRep;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRep userRepository;
	
	@GetMapping
	public List<Users> listing() {
		return userRepository.findAll();
	}
	
	@DeleteMapping
	public List<Users> removeUser(long id) {
		userRepository.deleteById(id);
		return null;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Users addUser(@RequestBody Users users) {
		return userRepository.save(users);
	}
	
}
