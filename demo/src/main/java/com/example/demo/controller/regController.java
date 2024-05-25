package com.example.demo.controller;

import java.util.Date;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.entity.userInfo;
import com.example.demo.service.userService;

@Controller
public class regController {
	
	Logger LOGGER = LoggerFactory.getLogger(regController.class);
	
	Date date = new Date();
	
	@Autowired
	private userService userService;
	
	@GetMapping(value = "/reg")
	public String RegView() {
		return "regView";
	}
	
	@PostMapping(value = "/reg")
	public String RegLogic(userInfo user) {
		user.setReg_date(date.toString());
		LOGGER.info("2번 {} ", userService.ChkRegLogic(user));
		
		return "../static/index";
	}
}
