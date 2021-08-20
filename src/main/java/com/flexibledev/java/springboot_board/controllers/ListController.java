package com.flexibledev.java.springboot_board.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.flexibledev.java.springboot_board.models.Post;
import com.flexibledev.java.springboot_board.repositories.PostRepository;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ListController {
	
	@Autowired
	PostRepository postRepository;
	
	@GetMapping(path = "/posts")
	public ModelAndView listPage() {
		ModelAndView mv = new ModelAndView("post/list");
		
		List<Post> posts = postRepository.findAll();
		
		log.info("=========== count: " + posts.size());
		
		mv.addObject("posts", posts);
		
		return mv;
	}
	
}
