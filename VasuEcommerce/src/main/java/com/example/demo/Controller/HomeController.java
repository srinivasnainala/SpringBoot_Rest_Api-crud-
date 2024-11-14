package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/Home")
	public String home()
	{
		return "Have a nice day";
	}
}
