package com.thinkitive.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkitive.dao.onlineexamrepo;
import com.thinkitive.model.Online_Exam;
@Service
public class examservice {
@Autowired
onlineexamrepo repo;

public void addExam(Online_Exam exam) {
	repo.save(exam);
}

public void updateExam(Online_Exam exam) {
	repo.save(exam);
}

public String delete(long examId)
{
	repo.deleteById((long)examId);
	return "deleted sucssefully"+examId;
	
}
public List<Online_Exam> getall() {
	return repo.findAll();
}
public Optional<Online_Exam> getbyid(long examId) {
	return repo.findById((long) (examId));
}
public void deleteExam(Online_Exam exam) {
	repo.delete(exam);
}
}

