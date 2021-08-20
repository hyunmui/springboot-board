package com.flexibledev.java.springboot_board.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Post {
	
	@Id
	@GeneratedValue
	private int postId;

	private String title;
	
	private String content;
}
