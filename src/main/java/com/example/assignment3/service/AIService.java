package com.example.assignment3.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AIService {
    private final Map<String, String> kbArticles = Map.of(
            "reset password", "How to reset your password in the portal.",
            "vpn issue", "Troubleshooting VPN connectivity problems.",
            "email not working", "Steps to fix email access issues."
    );

    public List<String> findRelevantArticles(String query) {
        List<String> matches = new ArrayList<>();
        kbArticles.forEach((k, v) -> {
            if (query.toLowerCase().contains(k)) {
                matches.add(v);
            }
        });
        return matches;
    }

    public String generateSummary(List<String> matchedArticles) {
        if (matchedArticles.isEmpty()) {
            return "No relevant articles found.";
        }
        return "Found " + matchedArticles.size() + " relevant article(s): " + String.join(" | ", matchedArticles);
    }
//    Windows Credentials
}