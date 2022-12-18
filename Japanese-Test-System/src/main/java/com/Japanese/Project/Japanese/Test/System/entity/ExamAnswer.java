package com.Japanese.Project.Japanese.Test.System.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
/* 跟資料庫互動 */
@Table(name = "examAns") 
@NamedQuery(name = "examAns.findAll", query = "SELECT Ans FROM ExamAnswer Ans")
public class ExamAnswer {
	
	@Id
	@Column(name = "examAnswer_id")
	private UUID examAnswerId = UUID.randomUUID();
	
	@Column(name = "exam_title")
	private String examTitle;
	
	@Column(name = "exam_level")
	private String examLevel;
	
	@Column(name = "ques_title")
	private String quesTitle;
	
	@Column(name = "ques_answer")
	private String quesAnswer;
	
	@Column(name = "fallibility")
	private boolean fallibility;
	
	@Column(name = "uploadDate")
	private Date uploadDate = new Date();
	
	@Column(name = "updateDate")
	private Date updateDate = new Date();

	public UUID getExamAnswerId() {
		return examAnswerId;
	}

	public void setExamAnswerId(UUID examAnswerId) {
		this.examAnswerId = examAnswerId;
	}

	public String getExamTitle() {
		return examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public String getExamLevel() {
		return examLevel;
	}

	public void setExamLevel(String examLevel) {
		this.examLevel = examLevel;
	}

	public String getQuesTitle() {
		return quesTitle;
	}

	public void setQuesTitle(String quesTitle) {
		this.quesTitle = quesTitle;
	}

	public String getQuesAnswer() {
		return quesAnswer;
	}

	public void setQuesAnswer(String quesAnswer) {
		this.quesAnswer = quesAnswer;
	}

	public boolean isFallibility() {
		return fallibility;
	}

	public void setFallibility(boolean fallibility) {
		this.fallibility = fallibility;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
