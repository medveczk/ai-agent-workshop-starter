package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SearchController {

    @GetMapping("/search")
    public List<String> search(@RequestParam("query") String query) {
        // For now, return a dummy list of strings
        return Arrays.asList("Result 1 for " + query, "Result 2 for " + query, "Result 3 for " + query);
    }
}
