package com.codedifferently.fullstack_demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.clerk.backend_api.helpers.jwks.VerifyToken;
import com.clerk.backend_api.helpers.jwks.VerifyTokenOptions;

@Service
public class ClerkService {

    @Value("${app.clerk.secretKey}")
    private String secretKey;

    public String getUserId(String token) {
        try {
            var claims = VerifyToken.verifyToken(token, VerifyTokenOptions.secretKey(secretKey).build());
            return claims.get("sub", String.class);
        } catch (Exception e) {
            return null;
        }
    }
}
