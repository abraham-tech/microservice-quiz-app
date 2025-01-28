package net.javaguides.quizservice.repository;

import net.javaguides.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
