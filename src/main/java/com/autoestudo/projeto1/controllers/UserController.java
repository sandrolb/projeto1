package com.autoestudo.projeto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.autoestudo.projeto1.repository.UserRepository;

@Controller
public class UserController {
	
	private UserRepository userRepo;
	
	public UserController(UserRepository userRepository){
		this.userRepo = userRepository;
	}
	
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userRepo.findAll());
		return "user";
	}
	
}
