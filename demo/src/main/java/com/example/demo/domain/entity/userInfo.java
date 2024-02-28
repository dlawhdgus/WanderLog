package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "user_Info")
@Data
@Getter
public class userInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idx;
	
	private String id;
	
	private String password;

	private String name;

	private String email;
	
	private String reg_date;
  }
