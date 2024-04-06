package com.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping
	public String home() {
		return "index";
	}
}




	/*
	 * @GetMapping public String home(Model model) { model.addAttribute("features",
	 * Arrays.asList( "List iterate", "HTML template")); return "index"; }
	 */

