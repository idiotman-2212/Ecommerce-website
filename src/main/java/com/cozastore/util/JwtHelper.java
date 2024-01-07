package com.cozastore.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;


@Component
public class JwtHelper {
    // @Value: giúp lấy thông tin cấu hình file application.properties;

    @Value("${custom.token.key}")
    private String secKey;

    private long expiredTime = 8 * 60 * 60 * 1000;

    public String generateToken(String data, int userId){
        // Lấy key đã lưu trữ và sử dụng để tạo ra token
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secKey));

        // Sinh ra thời gian hết hạn mới
        Date date = new Date();
        long newDateMilis = date.getTime() + expiredTime;
        Date newExpiraDate = new Date(newDateMilis);

        String token = Jwts.builder()
                .setSubject(data)
                .claim("userId", userId)
                .signWith(key)
                .setExpiration(newExpiraDate)
                .compact();

        return token;
    }

    // Giải mã token
    public String parserToken(String token){
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secKey));

        String data = Jwts.parserBuilder()
                .setSigningKey(key).build() // Truyền key cần giải mã token
                .parseClaimsJws(token) //Truyền vào token cần giải mã
                .getBody().getSubject(); // Lấy nội dung lưu trữ trong token

        return data;
    }

    public int getUserIdFromToken(String token) {
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secKey));

        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key).build()
                .parseClaimsJws(token)
                .getBody();

        return claims.get("userId", Integer.class);
    }

}
