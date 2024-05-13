package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/hello")
	public String input() {

		return "input";
	}

	@PostMapping("hello")
	public String show(
			@RequestParam("name") String name,
			@RequestParam("age") String age,
			@RequestParam("hobby") String hobby,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("hobby", hobby);
		return "hello";
	}
}