package com.thinkitive.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long questionId;
	private Long examId;
	private String questionTitle;
	private int questionAnswerOption;
	
	
	public List<Option> getOption() {
		return option;
	}


	public void setOption(List<Option> option) {
		this.option = option;
	}


	public Question() {
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Option> option;


	public Long getQuestionId() {
		return questionId;
	}


	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}


	public Long getExamId() {
		return examId;
	}


	public void setExamId(Long examId) {
		this.examId = examId;
	}


	public String getQuestionTitle() {
		return questionTitle;
	}


	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}


	public int getQuestionAnswerOption() {
		return questionAnswerOption;
	}


	public void setQuestionAnswerOption(int questionAnswerOption) {
		this.questionAnswerOption = questionAnswerOption;
	}


	
}
