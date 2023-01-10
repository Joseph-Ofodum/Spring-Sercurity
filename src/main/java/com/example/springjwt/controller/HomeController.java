package com.example.springjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String getHomepage() {
        return "This is the home page!";
    }

    @GetMapping("products")
    public String getProducts() {
        return "This is the list of products";
    }
}
