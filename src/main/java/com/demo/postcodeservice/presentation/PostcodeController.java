package com.demo.postcodeservice.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostcodeController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
