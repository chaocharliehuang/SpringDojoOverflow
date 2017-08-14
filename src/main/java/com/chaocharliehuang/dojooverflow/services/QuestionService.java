package com.chaocharliehuang.dojooverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chaocharliehuang.dojooverflow.models.Question;
import com.chaocharliehuang.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {

	private QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public List<Question> getAllQuestions() {
		return (List<Question>) questionRepository.findAll();
	}
	
	public void addQuestion(Question question) {
		questionRepository.save(question);
	}
	
	public void updateQuestion(Question question) {
		questionRepository.save(question);
	}
	
	public Question findQuestionById(Long id) {
		return questionRepository.findOne(id);
	}
}
