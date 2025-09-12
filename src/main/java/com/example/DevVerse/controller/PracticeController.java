package com.example.DevVerse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PracticeController {

    @GetMapping("/practice")
    public String practicePage() {
        return "practice"; // src/main/resources/templates/practice.html
    }
}
