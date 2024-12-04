package com.saksham.quiz.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "python_questions") // Specify table name explicitly
public class PythonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_text", nullable = false) // Column name and constraints
    private String questionText;

    @Column(name = "correct_answer", nullable = false) // Column name and constraints
    private String correctAnswer;

    @ElementCollection
    @CollectionTable(name = "python_question_options", joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "option_text")
    private List<String> options;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
