package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.config.JwtConfig;
import com.example.demo.domain.dto.LoginDto;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import util.JwtBuilder;

@Controller
public class loginController {
	
	private JwtConfig jwtConfig;
	
	public loginController(JwtConfig jwtConfig) {
		this.jwtConfig = jwtConfig;
	}
	

	@GetMapping(value = "/login")
	public String LoginView() {
        return "loginView.html";
	}
	
	@PostMapping(value = "/login")
	public String LoginLogic(HttpServletResponse response,
			@ModelAttribute LoginDto loginDto) {
		
		JwtBuilder jwtBuilder = new JwtBuilder(jwtConfig);
		
		String userId = loginDto.getUserId();
		String password = loginDto.getPassword();

		String jwtId = jwtBuilder.Build(userId);
		
		Cookie cookie = new Cookie("jwtToken", jwtId);
		cookie.setMaxAge(60 * 60);
		response.addCookie(cookie);
		
		return "maps";
	}
}
