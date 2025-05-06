package com.example.sampleDockerImpl.controller;

import com.example.sampleDockerImpl.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dockerDemo")
public class SampleDockerController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World") String name) {
        return greetingService.greet(name);
    }
}
