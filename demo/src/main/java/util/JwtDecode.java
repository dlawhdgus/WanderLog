package util;

import com.example.demo.config.JwtConfig;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

public class JwtDecode {
	
	private JwtConfig jwtConfig;
	
	public JwtDecode(JwtConfig jwtConfig) {
		this.jwtConfig = jwtConfig;
	}
	
	public String Decoder(String token) {
		String secrekey = jwtConfig.secret;
		
		Jws<Claims> jwtClaims = Jwts.parserBuilder()
				.setSigningKey(secrekey)
				.build()
				.parseClaimsJws(token);
		
		Claims claims = jwtClaims.getBody();
		
		String userId = claims.getSubject();
		
		
		return userId;
	}

}
