package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import domain.User;
import domain.UserRepository;

@Controller
public class UserController {
	private List<User> users = new ArrayList<User>();
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("create")
	public String create(User user) {
		userRepository.save(user);
		return "redirect:/list"; 
	}
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", userRepository);
		return "list";
	}
}
