package com.example.demo.domain.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class LoginDto {
	
	private String userId;
	
	private String password;
}
