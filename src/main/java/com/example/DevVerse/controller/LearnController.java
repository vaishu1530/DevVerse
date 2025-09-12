package com.example.DevVerse.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class LearnController {

	    @GetMapping("/learn")
	    public String learnHome() {
	        return "learn/learn-home";
	    }

	    @GetMapping("/learn/introduction")
	    public String introduction() {
	        return "learn/introduction";
	    }

	    @GetMapping("/learn/variables")
	    public String variables() {
	        return "learn/variables";
	    }

	    @GetMapping("/learn/datatypes")
	    public String datatypes() {
	        return "learn/datatypes";
	    }
	    
	    @GetMapping("/learn/operators") // ✅ corrected spelling
	    public String operators() {
	        return "learn/operators"; // ✅ this should match your HTML filename (operators.html)
	    } 
	    
	    @GetMapping("/learn/control-statements")
	    public String controlStatements() {
	        return "learn/control-statements";
	    }
	    
	    @GetMapping("/learn/arrays")
	    public String arrays() {
	        return "learn/arrays";
	    }
	    @GetMapping("/learn/recursion")
	    public String recursion() {
	        return "learn/recursion";
	    }
	    
	    @GetMapping("/learn/storage-classes")
	    public String storageClasses() {
	        return "learn/storage-classes";
	    }
	    
	    @GetMapping("/learn/enum")
	    public String enumPage() {
	        return "learn/enum";
	    }
	    
	    @GetMapping("/learn/functions")
	    public String functionsPage() {
	        return "learn/functions";
	    }
	    
	    @GetMapping("/learn/loops")
	    public String loops() {
	        return "learn/loops";
	    }
	    
	    @GetMapping("/learn/pointers")
	    public String pointers() {
	        return "learn/pointers";
	    }
	    
	    @GetMapping("/learn1")
	    public String learnHome1() {
	        return "learn/learn-home1";
	    }







	}
	
	


