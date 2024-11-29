package com.codedifferently.fullstack_demo.service;

import org.springframework.stereotype.Service;

import com.clerk.backend_api.Clerk;
import com.clerk.backend_api.helpers.jwks.VerifyToken;
import com.clerk.backend_api.helpers.jwks.VerifyTokenOptions;

@Service
public class ClerkService {

    private final Clerk clerkClient;

    public ClerkService() {
        this.clerkClient = Clerk.builder()
                .bearerAuth("sk_test_EVGnFzQmOO6UQpeCC6dUrAHocP7YpPGz93ZlNFmyRw")
                .build();
    }

    public String getUserId(String token) {
        try {
            var claims = VerifyToken.verifyToken(token, VerifyTokenOptions.secretKey("sk_test_EVGnFzQmOO6UQpeCC6dUrAHocP7YpPGz93ZlNFmyRw").build());
            return claims.get("sub", String.class);
        } catch (Exception e) {
            return null;
        }
    }
}
