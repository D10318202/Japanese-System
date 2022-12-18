package com.Japanese.Project.Japanese.Test.System.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
/* 跟資料庫互動 */
@Table(name = "question") 
@NamedQuery(name = "question.findAll", query = "SELECT ques FROM Question ques")
public class Question {
	
	@Id
	@Column(name = "question_id")
	private UUID questionId = UUID.randomUUID();
	
	@Column(name = "exam_id")
	private UUID examId;
	
	@Column(name = "question_title")
	private String questionTitle;
	
	@Column(name = "question_choice")
	private String questionChoice;
	
	@Column(name = "question_level")
	private String questionLevel;
	
	@Column(name = "question_difficulty")
	private String questionDifficulty;

	@Column(name = "question_radio")
	private boolean questionRadio;

	public UUID getQuestionId() {
		return questionId;
	}

	public void setQuestionId(UUID questionId) {
		this.questionId = questionId;
	}

	public UUID getExamId() {
		return examId;
	}

	public void setExamId(UUID examId) {
		this.examId = examId;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public String getQuestionChoice() {
		return questionChoice;
	}

	public void setQuestionChoice(String questionChoice) {
		this.questionChoice = questionChoice;
	}

	public String getQuestionLevel() {
		return questionLevel;
	}

	public void setQuestionLevel(String questionLevel) {
		this.questionLevel = questionLevel;
	}

	public String getQuestionDifficulty() {
		return questionDifficulty;
	}

	public void setQuestionDifficulty(String questionDifficulty) {
		this.questionDifficulty = questionDifficulty;
	}

	public boolean isQuestionRadio() {
		return questionRadio;
	}

	public void setQuestionRadio(boolean questionRadio) {
		this.questionRadio = questionRadio;
	}

}
