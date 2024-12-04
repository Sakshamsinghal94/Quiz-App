package com.saksham.quiz.repo;

import com.saksham.quiz.entity.JavaScript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaScriptRepo extends JpaRepository<JavaScript,Long> {
}
