package com.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
