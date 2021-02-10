package com.thinkitive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkitive.dao.Examenroll;
import com.thinkitive.model.ExamEnroll;
@Service
public class Examenrollservice {
	@Autowired
	Examenroll repo;
	
	
public ExamEnroll enroll(ExamEnroll e)
{
	return repo.save(e);
}
public void unenroll(ExamEnroll e)
{
	repo.delete(e);
	
}


public List<ExamEnroll> enroll1() {
	return repo.findAll();
}


}
	