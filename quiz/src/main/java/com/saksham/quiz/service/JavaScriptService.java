package com.saksham.quiz.service;

import com.saksham.quiz.entity.JavaScript;
import com.saksham.quiz.repo.JavaScriptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavaScriptService {
    @Autowired
    JavaScriptRepo javaScriptRepo;

    public List<JavaScript>getQuestion(){
         return javaScriptRepo.findAll();
    }
    public JavaScript saveQuestion(JavaScript javaScript){
         return javaScriptRepo.save(javaScript);
    }
}
