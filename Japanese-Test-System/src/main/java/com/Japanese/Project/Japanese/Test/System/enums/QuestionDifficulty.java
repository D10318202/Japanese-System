package com.Japanese.Project.Japanese.Test.System.enums;

public enum QuestionDifficulty {

	Difficult("困難"), Easy("簡單");

	private String difficulty;

	QuestionDifficulty(String difficulty) {
		this.difficulty = difficulty;		
	}

	public String getDifficulty() {
		return difficulty;
	}

}
