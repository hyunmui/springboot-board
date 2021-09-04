package com.flexibledev.java.springboot_board.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

@Controller(value = "/")
public class MainController {

	@GetMapping(name = "main.index", value = "")
	public View index() {
		return new RedirectView("/posts");
	}
	
}
