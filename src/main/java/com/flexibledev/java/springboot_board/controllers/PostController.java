package com.flexibledev.java.springboot_board.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.flexibledev.java.springboot_board.models.Post;
import com.flexibledev.java.springboot_board.repositories.PostRepository;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/post")
@Slf4j
public class PostController {

	@Autowired
	PostRepository postRepository;
	
	@GetMapping("write")
	public ModelAndView write() {
		return new ModelAndView("post/write", "post", new Post());
	}
	
	@PostMapping("write.do")
	public View save(@ModelAttribute Post post) {
		log.info("============== writing post! " + post.toString());
		Post newPost = postRepository.saveAndFlush(post);
		return new RedirectView("/post/" + newPost.getPostNumber());
	}
	
	@GetMapping("{postId}")
	public ModelAndView detail(@PathVariable int postId) {
		log.info("============== 입력받은 글: " + postId);
		return new ModelAndView("post/detail", "post", postRepository.getById(postId));
	}
	
}
