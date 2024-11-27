package com.samsung;

public class Cat {
	public int id;
	private String name;

	public Cat() {}

	public Cat(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void test1(Dog d) {
		System.out.println(d.by1);
	}
	
	// method overloading을 학습
	// 같은 클래스 내에 이름이 같은 메서드가 있어도 아래의 3가지 조건 중 하나라도 만족하면 문법적으로 문제가 안됨.
	// 메서드 명이 같아도 매개변수의 수가 다르면 괜찮음.
	// 메스드 명이 같아도 매개변수의 자료형이 다르면 괜찮음.
	// 메서드 명이 같아도 매개변수의 자료형의 배치순서가 다르면 괜찮음.
	public void printWhat() {
		System.out.println("what");
	}

	public void printWhat(int msg) {
		System.out.println("what");
	}
	
	public void printWhat(int msg, String str) {
		System.out.println("what");
	}

	public void printWhat(String str, int msg) {
		System.out.println("what");
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
