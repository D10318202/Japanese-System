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
@Table(name = "exam") 
@NamedQuery(name = "exam.findAll", query = "SELECT exam FROM Exam exam")
public class Exam {
	
	@Id
	@Column(name = "exam_id")
	private UUID examId = UUID.randomUUID();

	@Column(name = "exam_title", length=20)
	private String examTitle;
	
	@Column(name = "exam_level")
	private String examLevel;
	
	@Column(name = "exam_year")
	private String examYear;
	
	@Column(name = "updateDate")
	private Date updateDate = new Date();
	
	@Column(name = "createDate")
	private Date createDate = new Date();

	public UUID getExamId() {
		return examId;
	}

	public void setExamId(UUID examId) {
		this.examId = examId;
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

	public String getExamYear() {
		return examYear;
	}

	public void setExamYear(String examYear) {
		this.examYear = examYear;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
