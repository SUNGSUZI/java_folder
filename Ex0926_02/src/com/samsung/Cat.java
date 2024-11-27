package com.samsung;

import java.util.Date;

public class Cat {
	
	
	private String id;
	private String name;
	private Date birth;
	private Dog dog;
	
	public Cat() {}
	
	public Cat(String id, String name, Date birth,Dog dog) {
		this.id = id;
		this.name = name;
		this.birth = birth;
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
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	
	
	// if~else
	public void test11(int a) {
		if(a>10) {
			System.out.println("hello");
		}else {
			System.out.println("good");
		}
		System.out.println("world");
	}
	
	
	public int test12(int a, int b) {
		//a가 b의 배수이면, 3을 반환하고 그렇지 않으면 10을 반환.
		if(a%b == 0) {
			return 3;
		}else {
			return 10;
		}
	}

	public void test13(String str1, String str2) {
		// 동일성 비교(==)
		// 동등성비교(.equals)
		
		if(str1 == str2) {
			int[] arr = {1,2};
			System.out.println("같음");
		}else {
			int[] arr = new int[2];
			System.out.println("다름");
		}

	}
	

	
	
	
}

