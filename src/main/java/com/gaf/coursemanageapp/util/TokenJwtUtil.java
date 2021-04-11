package com.gaf.coursemanageapp.util;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class TokenJwtUtil {
    static final long EXPIRATIONTIME = 86_400_000; // 1 day
    static final String SECRET = "SecretKeyTangYuCheng";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "Authorization";

    public static String generateJwt(String userId) {
        long expirationTime = EXPIRATIONTIME;
        return Jwts.builder()
                .setId(userId)
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    }
    public static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(HEADER_STRING);
        if (token != null) {
            // parse the token
            Claims claims = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody();
            String userId = claims.getId();
            return userId != null ?
                    new UsernamePasswordAuthenticationToken(userId, emptyList()) :
                    null;
        }
        return null;
    }


}
