package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // HTTP GET request
    @GetMapping("/hello")
    public String hello() {
        // Returns a simple string as a response
        return "Hola mundo!!!!!!!!!";
    }

    // HTTP GET request with a query parameter
    @GetMapping("/echo")
    public String echo(@RequestParam String name) {
        // Returns a personalized greeting with the provided name
        return "Hello World " + name + "!!!!!";
    }

    // HTTP POST request
    @PostMapping("/post")
    public String postExample(@RequestBody String payload) {
        // Returns the received payload as a response
        return "Received payload: " + payload;
    }

    // HTTP PUT request
    @PutMapping("/put")
    public String putExample(@RequestBody String payload) {
        // Simulates updating a resource with the provided payload
        return "Updated resource with payload: " + payload;
    }

    // HTTP DELETE request
    @DeleteMapping("/delete")
    public String deleteExample() {
        // Simulates deletion of a resource
        return "Resource deleted";
    }

    // HTTP PATCH request
    @PatchMapping("/patch")
    public String patchExample(@RequestBody String payload) {
        // Simulates partial update of a resource with the provided payload
        return "Patched resource with payload: " + payload;
    }
}
