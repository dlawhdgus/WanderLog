package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.userInfo;

@Repository
public interface userRepository extends JpaRepository<userInfo, Integer>{

	Boolean existsById(String id);
	
}
