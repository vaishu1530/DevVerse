package com.example.DevVerse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {

    @GetMapping("/quiz")
    public String quizHome() {
        return "quiz/quiz-home";
    }

    @GetMapping("/quiz/introduction")
    public String introductionQuiz() {
        return "quiz/introduction-quiz";
    }
    
    @GetMapping("/quiz/variables")
    public String variablesQuiz() {
        return "quiz/variables-quiz";
    }
    
    @GetMapping("/quiz/data-types")
    public String dataTypesQuiz() {
        return "quiz/data-types-quiz"; // this should match your Thymeleaf template filename
    }
    
    @GetMapping("/quiz/operators")
    public String operatorsQuiz() {
        return "quiz/operators-quiz";
    }
    
    @GetMapping("/quiz/input-output")
    public String inputOutputQuiz() {
        return "quiz/input-output-quiz"; // maps to input-output-quiz.html
    }

    @GetMapping("/quiz/loops")
    public String loopsQuiz() {
        return "quiz/loops-quiz";
    }
    
    @GetMapping("/quiz/functions")
    public String functionsQuiz() {
        return "quiz/functions-quiz";
    }
    
    @GetMapping("/quiz/arrays")
    public String arraysQuiz() {
        return "quiz/arrays-quiz";
    }
    
    @GetMapping("/quiz/strings")
    public String stringsQuiz() {
        return "quiz/strings-quiz"; // This should match your HTML file name in src/main/resources/templates/quiz/
    }
    
    @GetMapping("/quiz/pointers")
    public String pointersQuiz() {
        return "quiz/pointers-quiz"; // assuming your HTML is saved as pointers-quiz.html in /templates/quiz/
    }


    // Add other mappings only, no services used here for now
}
