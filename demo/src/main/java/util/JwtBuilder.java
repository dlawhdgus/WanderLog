package util;

import java.util.Date;

import com.example.demo.config.JwtConfig;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtBuilder {
	private JwtConfig jwtConfig;
	
	public JwtBuilder(JwtConfig jwtConfig) {
		this.jwtConfig = jwtConfig;
	}
	
	@SuppressWarnings("deprecation")
	public String Build(String userId) {
		
		String secretKey = jwtConfig.secret;
		int expired = jwtConfig.expiration;
		
		Claims claims = Jwts.claims();
		claims.setSubject(userId);
		claims.setIssuer("Lim");
		claims.setExpiration(new Date(System.currentTimeMillis() + expired * 1000));
		claims.setIssuedAt(new Date());
		
		String jwt = Jwts.builder()
				.setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, secretKey)
				.compact();
		
		return jwt;
	}

}
