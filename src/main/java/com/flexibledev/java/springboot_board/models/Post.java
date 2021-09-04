package com.flexibledev.java.springboot_board.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private int postNumber;

	private String title;
	
	private String content;

	@ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
	private User writer;

	private LocalDateTime createdAt;
}
