package com.wileyedge.classroster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClassRosterApp {

    @GetMapping()
    public String helloWorld() {
        return "<html><h1>Hello World</h1></html>";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "<html><h1>Later dude</h1></html>";
    }
}
