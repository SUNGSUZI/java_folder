package com.naver;

public enum A {
	PIG("돼지"), CAT("고양이"), DOG("개");
	
	private final String name;

	private A(String name) {
		this.name = name;
	}
	
	// final은 set이 없다.
	public String getName() {
		return name;
	}
	
	
}
