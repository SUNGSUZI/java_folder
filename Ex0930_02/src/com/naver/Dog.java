package com.naver;

public class Dog {

	private int id;
	
	public Dog(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + "]";
	}
	
	
}
