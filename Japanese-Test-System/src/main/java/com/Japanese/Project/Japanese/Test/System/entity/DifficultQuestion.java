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
@Table(name = "difficultQues") 
@NamedQuery(name = "difficultQues.findAll", query = "SELECT diff FROM DifficultQuestion diff")
public class DifficultQuestion {
	
	@Id
	@Column(name = "difficultQues_id")
	private UUID difficultQuestionId = UUID.randomUUID();
	
	@Column(name = "difficultQues_title")
	private String difficultQuestionTitle;
	
	@Column(name = "difficultQues_choice")
	private String difficultQuestionChoice;
	
	@Column(name = "difficultQues_level")
	private String difficultQuestionLevel;
	
	@Column(name = "difficultQues_radio")
	private boolean difficultQuestionRadio;
	
	@Column(name = "createDate")
	private Date createDate = new Date();

	public UUID getDifficultQuestionId() {
		return difficultQuestionId;
	}

	public void setDifficultQuestionId(UUID difficultQuestionId) {
		this.difficultQuestionId = difficultQuestionId;
	}

	public String getDifficultQuestionTitle() {
		return difficultQuestionTitle;
	}

	public void setDifficultQuestionTitle(String difficultQuestionTitle) {
		this.difficultQuestionTitle = difficultQuestionTitle;
	}

	public String getDifficultQuestionChoice() {
		return difficultQuestionChoice;
	}

	public void setDifficultQuestionChoice(String difficultQuestionChoice) {
		this.difficultQuestionChoice = difficultQuestionChoice;
	}

	public String getDifficultQuestionLevel() {
		return difficultQuestionLevel;
	}

	public void setDifficultQuestionLevel(String difficultQuestionLevel) {
		this.difficultQuestionLevel = difficultQuestionLevel;
	}

	public boolean isDifficultQuestionRadio() {
		return difficultQuestionRadio;
	}

	public void setDifficultQuestionRadio(boolean difficultQuestionRadio) {
		this.difficultQuestionRadio = difficultQuestionRadio;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	

}
