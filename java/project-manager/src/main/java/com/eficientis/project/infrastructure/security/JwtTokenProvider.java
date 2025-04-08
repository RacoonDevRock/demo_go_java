package com.eficientis.project.infrastructure.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.eficientis.project.users.domain.model.GlobalUser;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class JwtTokenProvider {

    @Value("${security.jwt.secret}")
    private String secret;

    private final long EXPIRATION_TIME = 43200000;

    public String generateToken(GlobalUser user) {
        return JWT.create()
                .withSubject(user.getEmail())
                .withClaim("email", user.getEmail())
                .withClaim("isSystemAdmin", user.isSystemAdmin())
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .sign(Algorithm.HMAC256(secret));
    }

    public DecodedJWT getDecodedJWT(String token) {
        try {
            return JWT.require(Algorithm.HMAC256(secret))
                    .build()
                    .verify(token);
        } catch (JWTVerificationException e) {
            throw new RuntimeException("Token inválido o expirado", e);
        }
    }

    public String getEmailFromToken(String token) {
        return getDecodedJWT(token).getSubject();
    }

    public String getUserIdFromToken(String token) {
        return getDecodedJWT(token).getClaim("id").asString();
    }

    public boolean isAdmin(String token) {
        return getDecodedJWT(token).getClaim("isSystemAdmin").asBoolean();
    }

    public boolean validateToken(String token) {
        try {
            JWT.require(Algorithm.HMAC256(secret))
                    .build().verify(token);
            return true;
        } catch (JWTVerificationException e) {
            return false;
        }
    }
}

