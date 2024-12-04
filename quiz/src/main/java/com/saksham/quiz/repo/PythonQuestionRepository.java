package com.saksham.quiz.repo;

import com.saksham.quiz.entity.PythonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PythonQuestionRepository extends JpaRepository<PythonEntity, Long> {
}