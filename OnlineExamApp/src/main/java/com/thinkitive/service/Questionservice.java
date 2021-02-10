package com.thinkitive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thinkitive.dao.QuestionRepo;
import com.thinkitive.model.Question;

@Service
public class Questionservice {

	@Autowired
	private QuestionRepo repo;
	
	public Question addQuestion(Question q) {
		return repo.save(q);
	}
	
	public void updateQuestion(Question que) {
		repo.save(que);
	}
	
	public String delete(long id)
	{
		repo.deleteById(id);
		return "deleted sucssefully"+id;
		
	}
	public List<Question> getall() {
		return repo.findAll();
	}

	public Optional<Question> getbyid(long id) {
		return repo.findById((long) id);
	}
	
}



