package com.saksham.quiz.service;

import com.saksham.quiz.entity.PythonEntity;
import com.saksham.quiz.entity.QuizQuestion;
import com.saksham.quiz.repo.PythonQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PythonQuestionService {
    @Autowired
    private PythonQuestionRepository repository;

    public List<PythonEntity> getAllQuestions() {
        return repository.findAll();
    }

    public PythonEntity savepQuestion(PythonEntity question) {
        return repository.save(question); // Check for nulls or invalid inputs
    }

}
