package com.mony.Spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/filter")
    public String filter(
            @RequestParam String name,
            @RequestParam int age) {
        return name + " is " + age + " years old";
    }

}
