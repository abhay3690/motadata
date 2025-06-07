package com.example.assignment3.controller;


import com.example.assignment3.request.EventRequest;
import com.example.assignment3.response.EventResponse;
import com.example.assignment3.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search-query")
public class EventController {

    @Autowired
    private AIService aiService;

    @PostMapping
    public EventResponse handleSearchQuery(@RequestBody EventRequest request) {
        String query = request.getUserQuery();
        List<String> matched = aiService.findRelevantArticles(query);
        String summary = aiService.generateSummary(matched);
        return new EventResponse(summary, matched);
    }
}
