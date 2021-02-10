package com.thinkitive;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.dao.UserRepo;
import com.thinkitive.model.Online_Exam;
import com.thinkitive.model.Question;
import com.thinkitive.model.User;
import com.thinkitive.service.Questionservice;
import com.thinkitive.service.examservice;


@RestController
public class ExamController {

	@Autowired
	Questionservice service;
	@Autowired	
	examservice online1;
	
	@PostMapping("/add")
	public Question addquestion(@RequestBody Question q) {
		return service.addQuestion(q);

	}

	@GetMapping(value = "/get")
	public List<Question> getall() {
		return service.getall();
	}

	@GetMapping(value = "getbyid/{id}")
	public Optional<Question> getbyid(@PathVariable long id) {
		return service.getbyid(id);

	}

	@PutMapping(value = "/update")
	public Question update(@RequestBody Question q) {
		service.updateQuestion(q);
		return q;
	}

	@DeleteMapping(value = "delete/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "deleted suceesfully";

	}
	
	////////////////////////////////////////////////////////////////////////////
	
	@PostMapping("/addexam")
	public Online_Exam addexam(@RequestBody Online_Exam exam) {
	 online1.addExam(exam);
return exam;
	}

	@GetMapping(value = "/getexam")
	public List<Online_Exam> getall1() {
		return  online1.getall();
	}

	@GetMapping(value = "getexambyid/{examId}")
	public Optional<Online_Exam> Getbyid(@PathVariable long examId) {
		return  online1.getbyid(examId);

	}

	@PutMapping(value = "/updateexam")
	public Online_Exam update1(@RequestBody Online_Exam exam) {
		online1.updateExam(exam);
		return exam;
	}

	@DeleteMapping(value = "deletexam/{id}")
	public String delete1(@PathVariable Long id){
		online1.delete(id);
		return "deleted suceesfully";

	}
	@DeleteMapping(value = "deleteexam")
	public String delete2(Online_Exam exam){
		online1.deleteExam(exam);
		return "deleted suceesfully";

	}

}