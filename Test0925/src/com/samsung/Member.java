package com.samsung;

public class Member {
	/*
	 * 클래스의 구성요소
	 * 멤버변수 : 객체의 구성요솟를 표현. 멤버변수의 접근 제한자는 무조건 private
	 * 생성자 : 객체를 생성하게 함(참조자료형에 맞는값을 제공), 멤버변수를 초기화해줌.
	 * 메소드 : 객체의 기능(= 능력), 공통적인 코드를 묶어주는 함수 역할.
	 */
	
	private String id;
	private String name;
	private int age;
	private Dog dog;
	// 생성자는 반환형이 없음.
	public Member() {}

	public Member(String id, String name, int age) {
		super();
		//this : 객체 자신이라는 뜻.
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Member(String id, String name, int age, Dog dog) {
		super();
		//this : 객체 자신이라는 뜻.
		this.id = id;
		this.name = name;
		this.age = age;
		this.dog = dog;
	}
	
	
	public Dog getDog() {
		return dog;
	}
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	 
	
}
