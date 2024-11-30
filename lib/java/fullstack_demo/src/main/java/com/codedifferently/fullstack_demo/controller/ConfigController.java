package com.codedifferently.fullstack_demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ConfigController {

    @Value("${app.api.url}")
    private String apiUrl;

    @Value("${app.env}")
    private String environment;

    @Value("${app.clerk.perishableKey}")
    private String clerkPerishableKey;

    @GetMapping("/api/config")
    public Map<String, String> getConfig(Model model) {
        return Map.of(
                "API_URL", apiUrl,
                "ENV", environment,
                "CLERK_PERISHABLE_KEY", clerkPerishableKey
        );
    }
}
