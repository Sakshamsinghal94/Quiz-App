package com.saksham.quiz.controller;

import com.saksham.quiz.entity.JavaScript;
import com.saksham.quiz.entity.PythonEntity;
import com.saksham.quiz.entity.QuizQuestion;

import com.saksham.quiz.service.JavaScriptService;
import com.saksham.quiz.service.PythonQuestionService;
import com.saksham.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @CrossOrigin(origins = "http://localhost:8080")
    @RestController
    @RequestMapping("/api")
    public class  LoginController {


        @Autowired
        QuestionService questionService;



        @GetMapping("/questions")
        public List<QuizQuestion> getQuestions() {
            return questionService.getallQuestion();
        }

        @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
        public QuizQuestion saveQuestion(@RequestBody QuizQuestion question) {
            return questionService.saveQuestion(question);

        }
        @Autowired
        private PythonQuestionService service;

        @GetMapping("/python")
        public List<PythonEntity> getpQuestions() {
            return service.getAllQuestions();


        }
        @PostMapping("/savep")
        public PythonEntity savepQuestion(@RequestBody PythonEntity question) {
            return service.savepQuestion(question);

        }
        @Autowired
        private JavaScriptService javaScriptService;

        @GetMapping("/javaScript")
        public List<JavaScript>getAllQues(){
            return javaScriptService.getQuestion();
        }

        @PostMapping("/Javascript")
        public JavaScript saveallQues(@RequestBody JavaScript question){
            return javaScriptService.saveQuestion(question);
        }
    }



