package com.example.assignment3.response;

import java.util.List;

public class EventResponse {
    private String aiSummaryAnswer;
    private List<String> matchedArticles;

    public EventResponse(String aiSummaryAnswer, List<String> matchedArticles) {
        this.aiSummaryAnswer = aiSummaryAnswer;
        this.matchedArticles = matchedArticles;
    }

    public String getAiSummaryAnswer() {
        return aiSummaryAnswer;
    }

    public List<String> getMatchedArticles() {
        return matchedArticles;
    }
}