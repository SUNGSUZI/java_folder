package com.samsung;

public class Dog {

	private int id;
	private String name;
	
	public Dog() {}
	
	public Dog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void test1(int a) {
		//만약 a가 10보다 크면, sysout('hello')
		// java에서는 {}를 사용한다.
		if(a > 10) {
			System.out.println("hello");
		}
		System.out.println("test1메서드 종료");
		
	}
	
	public int test2(int a, int b) {
		int result = 0;
		// a가 b와 같으면, return 10
		if(a==b) {
			result =  10;
		}
		
		return result; 
	}

	
	public void test3(int a) {
		//만약 a가 3의 배수이면, 메서드의 실행을 종료하세요.
		// 여기에 구현하세요.
		
		// if(조건문){
		//	참일때 조건	
		// }
		if(a %3 ==0) {
			return;
		}
		System.out.println("여기는 test3 메서드본문");
	}
	
	public int getID() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
}
