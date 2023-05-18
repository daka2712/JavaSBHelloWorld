package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hola mundo!!!!!!!!!";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String name) {
        return "Hello World " + name + "!!!!!";
    }

}