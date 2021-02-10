package com.thinkitive.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thinkitive.model.userExamQuestionAnswer;

public interface UserExamQuestionAnswerRepo  extends JpaRepository<userExamQuestionAnswer,Long>{
	
	@Query("from userExamQuestionAnswer where userId=?1 and examId=?2")
	public List<userExamQuestionAnswer> findByuserAndExam(long id,long examid);
	

}
