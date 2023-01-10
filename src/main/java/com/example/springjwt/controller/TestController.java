package com.example.springjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TestController {

    @GetMapping("admin")
    public String getAdminPage() {
        return "this is the admin page!!";
    }

    @GetMapping("user")
    public String getUserPage() {
        return "this is the user page!!";
    }
}
