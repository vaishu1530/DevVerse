package com.example.DevVerse.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.io.InputStream;

@Controller
public class NotesController {

    @GetMapping("/notes")
    public String notesIndex() {
        return "notes/index";
    }

    @GetMapping("/notes/introduction")
    public String notesIntroduction() {
        return "notes/introduction";
    }

    @GetMapping("/notes/variables")
    public String notesVariables() {
        return "notes/variables";
    }

    @GetMapping("/notes/datatypes")
    public String notesDatatypes() {
        return "notes/datatypes";
    }
    

    @GetMapping("/notes/operators")
    public String notesOperatoes() {
        return "notes/operators";
    }

    // =======================
    
}
