package com.example.DevVerse.controller;

import com.example.DevVerse.model.User;
import com.example.DevVerse.service.UserService;
import com.example.DevVerse.service.UserProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserProgressService userProgressService;

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String processRegister(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, Principal principal) {
        String username = principal.getName();
        int completedTopics = userProgressService.getCompletedTopics(username);
        int totalTopics = 20; // Example total topics count

        model.addAttribute("completedTopics", completedTopics);
        model.addAttribute("totalTopics", totalTopics);

        return "dashboard";
    }
    
    
}
