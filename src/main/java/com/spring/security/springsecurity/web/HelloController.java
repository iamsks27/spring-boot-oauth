package com.spring.security.springsecurity.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World";
    }

    @GetMapping("/admin")
    public String getAdminInfo() {
        return "Admin";
    }
}
