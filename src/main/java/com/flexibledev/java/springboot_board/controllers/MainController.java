package com.flexibledev.java.springboot_board.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value = "/")
public class MainController {

	@GetMapping(name = "main.index", value = "")
	public String index() {
		return "main/index";
	}
	
}
