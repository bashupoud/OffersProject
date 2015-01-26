package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	/**
	 * Will land it to the Homepage
	 * @return
	 */
	@RequestMapping("/")
	public String showHome() {
		return "home"; 
	}
	
	
	@RequestMapping("/registration")
	public String showRegistration() {
		return "registration"; 
	}

}
