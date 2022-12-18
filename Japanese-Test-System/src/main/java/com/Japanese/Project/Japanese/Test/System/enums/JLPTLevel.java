package com.Japanese.Project.Japanese.Test.System.enums;

public enum JLPTLevel {
	
	Level5("N5"), Level4("N4"), Level3("N3"), Level2("N2"), Level1("N1");

	private String level;

	JLPTLevel(String level) {
		this.level = level;		
	}

	public String getLevel() {
		return level;
	}

}
