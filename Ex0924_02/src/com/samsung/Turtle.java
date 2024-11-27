package com.samsung;

public class Turtle {
	
	private int age = 10;
	String name = new String("홍");
	char color ='r';
	
	
	//default 생성자
	public Turtle() {}
	
	// 사용자 생성자
	public Turtle(int age) {
		this.age= age;
	}
	
	public Turtle(int age, String name, char color) {
		super();
		this.age = age;
		this.name = name;
		this.color = color;
	}

	public Turtle(int age, String name) {
		this.age =age;
		this.name =name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}


	
}
