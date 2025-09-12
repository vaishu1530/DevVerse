package com.example.DevVerse.controller;



	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class InterviewController {

	    @GetMapping("/interview")
	    public String interviewHome() {
	        return "interview/interview-home";
	    }

	    @GetMapping("/interview/questions")
	    public String interviewQuestions() {
	        return "interview/questions";
	    }
	}



