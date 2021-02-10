package com.thinkitive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkitive.dao.UserRepo;
import com.thinkitive.model.Question;
import com.thinkitive.model.User;

@Service
public class Userservice {
	@Autowired
	UserRepo repo;

	public List<User> get() {
		return repo.findAll();
	}

	public User add(User usr) {
		return repo.save(usr);
	}

	public Optional<User> getbyid(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public void delete(Long id) {
		repo.deleteById(id);

	}

	public User updateQuestion(User user) {
		return repo.save(user);

	}

}
