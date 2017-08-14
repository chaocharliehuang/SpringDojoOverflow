package com.chaocharliehuang.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chaocharliehuang.dojooverflow.models.*;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
	List<Answer> findByQuestion(Question question);
}
