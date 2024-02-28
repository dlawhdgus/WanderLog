package com.example.demo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Getter
@Configuration
public class JwtConfig {
	
	@Value("${jwt.secret.key}")
	public String secret;
	
	@Value("${jwt.expiration}")
	public int expiration;
	
	@Value("${jwt.prefix}")
	public String prefix;
	
}
