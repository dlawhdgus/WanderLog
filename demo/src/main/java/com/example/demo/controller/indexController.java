package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class indexController {
	
	
	@GetMapping(value = "/")
	public String IndexView() {
//	public String IndexView(HttpServletRequest request) {
//		String jwtToken = ""; 
//		Cookie[] Clist = request.getCookies();
//		for(Cookie cookie : Clist) {
//			jwtToken = cookie.getValue();
//		}
//		
//		System.out.print(jwtToken);
		
		
		
		return "../static/index.html";
	}
	
	@GetMapping(value = "/test")
	public String Test() {
		return "maps.html";
	}
	
	@GetMapping(value = "/test2")
	public String Test2() {
		return "test2.html";
	}
	
}
