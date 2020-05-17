package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/v1/user")
    public String getUser() {
        return "User";
    }

    @GetMapping("/v1/oper")
    public String getOper() {
        return "Operator";
    }

    @GetMapping("/v1/some")
    public String getSome() {
        return "Some";
    }
}
