package com.example.DevVerse.controller;

import com.example.DevVerse.service.CompilerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // remove or restrict origin in production
public class CompilerController {

    private final CompilerService compilerService;

    public CompilerController(CompilerService compilerService) {
        this.compilerService = compilerService;
    }

    @PostMapping("/run")
    public ResponseEntity<?> runCode(@RequestBody Map<String, String> payload) {
        String code = payload.get("code");
        if (code == null || code.trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("error", "No code provided"));
        }
        String language = payload.getOrDefault("language", "c");
        String versionIndex = payload.getOrDefault("versionIndex", "0");

        try {
            Map<String, Object> result = compilerService.execute(code, language, versionIndex);
            return ResponseEntity.ok(result);
        } catch (Exception ex) {
            return ResponseEntity.status(500).body(Map.of("error", "Execution failed", "details", ex.getMessage()));
        }
    }
}
