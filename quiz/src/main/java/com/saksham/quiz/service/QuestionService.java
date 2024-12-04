package com.saksham.quiz.service;

import com.saksham.quiz.entity.QuizQuestion;

import com.saksham.quiz.repo.QuestionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    @Autowired
    QuestionRepo questionRepo;


    public List<QuizQuestion> getallQuestion(){
         List<QuizQuestion> list = questionRepo.findAll();
         return list;
    }
    public QuizQuestion saveQuestion(QuizQuestion quizQuestion){
        QuizQuestion save = questionRepo.save(quizQuestion);
        return save;

}}
