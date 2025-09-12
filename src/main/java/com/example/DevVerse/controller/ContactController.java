package com.example.DevVerse.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

	@Controller
	public class ContactController {

	    @GetMapping("/contact")
	    public String showContactForm() {
	        return "contact";
	    }

	    @PostMapping("/contact")
	    public String handleContactForm(
	            @RequestParam("name") String name,
	            @RequestParam("email") String email,
	            @RequestParam("message") String message,
	            Model model) {
	        
	        // Here, you can save to a database or send an email.
	        // For now, let's just print to console and show a success message.
	        System.out.println("Contact message from: " + name + " (" + email + ")");
	        System.out.println("Message: " + message);

	        model.addAttribute("successMessage", "Thank you, " + name + "! We will get back to you soon.");
	        return "contact";
	    }
	}



