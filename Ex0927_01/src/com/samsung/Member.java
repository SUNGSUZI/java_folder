package com.samsung;

public class Member {
	
	
	private String id;
	private String name;
	private int age;
	
	
	private Dog dog;
	
	public Member() {}
	
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Member(String id, String name, int age, Dog dog) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dog = dog;
	}
	
	// switch ~ case 문을 이용해서 점수에 대해 수우미양가로 변환하기
	// swith에 들어가는 변수는 그냥 넣을때도 있지만 상황에 따라 가공해서 넣는다.
	// swiich ~ case문은 '==' 비교연산을 한다.
	// break는 어떤 역할을 할까? 조건이 참인 부분만 시행하고
	// 그 밑의 다른 조건들에 대한 실행문은 실행하지 않고
	// switch~case 문을 종료하게 함.
	// break문은 상황에 따라 안 쓸 때도 있음.
	// case문에 문자열값을 넣을때는 암시적 객체만 넣음.
	
	
	public void test1(int jumsu) {
		switch (jumsu/10) {
		case 10: 
			System.out.println("수");
			break;
		case 9 :
			System.out.println("수");
			break;
		case 8 :
			System.out.println("우");
			break;
		case 7 :
			System.out.println("미");
			break;
		case 6 :
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		}
	}
	
	public void test12(int month) {
		//1,3,5,7,8,10,12는 31일
		//2월은 28일 
		// 4,6,9,11월은 30일
		switch (month) {
		case 2:
			System.out.println(28);
			break;
		case 4,6,9,11:
			System.out.println(30);
			break;
		default:
			System.out.println(31);
			break;
		}
		
	}
	
	// boolean은 switch문은 사용 안된다
	// int, enum, String만 가능
	// new는 heap메모리에 저장된다
	public void test13(String msg) {
		switch(msg) {
		case "a":
			System.out.println("a");
			break;
		case "b": // new String
			System.out.println("b");
			break;
		default :
			break;
		}
	}
	
	public void test14(int val) {
		switch(val) {
		case 1 :
			System.out.println(1);
			break;
		case 'a' : // char 자료형은 default값이 0이다. 고로 문제가 되지 않음. 
			System.out.println('a');
			break;
		default :
			 break;
		}
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
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
}
