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
import com.thinkitive.model.Question;
import com.thinkitive.model.Score;
import com.thinkitive.model.User;
import com.thinkitive.model.userExamQuestionAnswer;
import com.thinkitive.service.UserExamQuestionAnswerService;
import com.thinkitive.service.Userservice;

@RestController
public class UserController {
	
@Autowired
Userservice service;
@Autowired 
UserExamQuestionAnswerService qaService;
@PostMapping("/adduser")
public User add(@RequestBody User user) {
	return service.add(user);
}
@GetMapping(value = "/getuser")
public List<User> getall() {
	return service.get();
}
@GetMapping(value = "user{id}")
public Optional<User> getbyid(@PathVariable long id) {
	return service.getbyid(id);

}

@PutMapping(value = "/updateuser")
public User update(@RequestBody User user) {
	service.updateQuestion(user);
	return user;
}

@DeleteMapping(value = "user/{id}")
public String delete(@PathVariable Long id) {
	service.delete(id);
	return "deleted suceesfully";
}
@PostMapping("/answer")
public userExamQuestionAnswer answerbystudent(@RequestBody userExamQuestionAnswer QA) {
	qaService.addQuestionWithAnswer(QA);
	return QA;
}

@GetMapping("/score")
public String studentScore(@RequestBody Score score) {
	return String.valueOf(qaService.CalculateScore(score.getUserId(), score.getExamId()));
}
}
