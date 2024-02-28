package com.example.demo.service;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entity.userInfo;
import com.example.demo.repository.userRepository;

import util.NullChk;

@Service
public class userService {
	
	private final userRepository userRepo;
	
	private Logger LOGGER = LoggerFactory.getLogger(userService.class);
	
	public userService(userRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	// Total Register Logic
	public String ChkRegLogic(userInfo user) {
		if(!((NullChk.isEmpty(user.getId())) || (NullChk.isEmpty(user.getPassword())) || (NullChk.isEmpty(user.getName())) || (NullChk.isEmpty(user.getEmail())))) {
			LOGGER.info("{}", user);
			if(!(ChkDuplicateID(user.getId()))) {
				RegLogic(user);
				return "success";
			} else {			
				return "이미 사용중인 아이디입니다.";
			}
		} else {
			return "빈칸 모두 입력해 주세요";
		}
	}
	
	
	
	// Insert userInfo
	public userInfo RegLogic(userInfo user) {	
		return userRepo.save(user);
	}
	
	// Check Duplicate UserId
	public Boolean ChkDuplicateID(String userId) {
		return userRepo.existsById(userId);
	}
	
	

}
