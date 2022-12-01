package com.sistemaescolar.sistemaEscolar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaescolar.sistemaEscolar.entidades.User;
import com.sistemaescolar.sistemaEscolar.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<com.sistemaescolar.sistemaEscolar.entidades.User> findAll(){
	List<com.sistemaescolar.sistemaEscolar.entidades.User> result = repository.findAll(); 
	return result;
	}
	
	@GetMapping(value = "/{id}")
	public User findByID(@PathVariable Long id){
		User result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user){
		return repository.save(user);
	}
	
}
