package com.thinkitive;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.model.ExamEnroll;
import com.thinkitive.model.Online_Exam;
import com.thinkitive.service.Examenrollservice;
@RestController
public class ExamEnrollController {	
	
	@Autowired
	Examenrollservice service;
	@PostMapping(value="/enroll")
	public ExamEnroll enroll(@RequestBody ExamEnroll exam) {
		 service.enroll(exam);
	return exam;
		}
	public ExamEnroll unenroll(@RequestBody ExamEnroll exam) {
		 service.unenroll(exam);
	return exam;
		}
	
	
	@GetMapping(value="/getenroll")
	public List<ExamEnroll> enroll1() {
		 return service.enroll1();
	
		}
}
