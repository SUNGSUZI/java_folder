package com.samsung;

public class Cat {
	String id = new String("1234");
	String name = new String("야옹이");
	int age = 1; 
	boolean isMale = false;
	
	
	public Cat() {
		System.out.println("매개변수가 없는 생성자를 디폴트 생성자라고 부릅니다.");
	}
	

	// 자동 getter, setter 생성
	// alt + shift + s
	// r
	public Cat(String id, String name, int age, boolean isMale) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.isMale = isMale;
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


	public boolean isMale() {
		return isMale;
	}


	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}


	public void k1() {
		System.out.println(this.name+ "이 걸어갑니다.");
	}
	
	public void k2(String name) {
		System.out.println(name + "(이)가 걸어갑니다.");
	}
	
	public int k3() {
		System.out.println("나이는" +this.age+"입니다.");
		return age;
	}
	
	public char k4(String id) {
		System.out.println("넘겨받은 아이디와");
		return id.charAt(0);
	}
}
