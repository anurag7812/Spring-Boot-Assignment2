package com.example.firstproject.controller;
import com.example.firstproject.services.UserService;

import com.example.firstproject.entities.User;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	private static final String UserService = null;
	@Autowired
	private UserService obj;
	@GetMapping("/user")
	public List<User> getUser(){
		return this.obj.getUser();
	}
	@GetMapping("/user/{userId}")
	public User getU(@PathVariable String userId) {
		return this.obj.getU(Integer.parseInt(userId));
	}
	@GetMapping()
	public String localHost() {
		return "Hii !, This is LocalHost";
	}
	@PostMapping("/user")
	public User addUser(@RequestBody User u) {
		return this.obj.addUser(u);
	}
	@DeleteMapping("/user/{userId}")
	public User deleteUser(@PathVariable String userId) {
		return this.obj.deleteUser(Integer.parseInt(userId));
	}
	
}
