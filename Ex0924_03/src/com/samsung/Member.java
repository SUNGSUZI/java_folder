package com.samsung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Member {

	private String id; 
	private String name;
	private int age;
	
	
	public Member() {}
	
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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



	
	// getDeungbonInfoBySsn 함수
	public String getDeungbonInfoBySsn(String ssn) {
		String msg = "주민등록본 정보를 반환";
		return msg;
	}
	
	public Dog getDog() {
		return new Dog();
	}  
	
	public void printHelloWorld() {
		System.out.println("hello world");
	}
	
	public ArrayList<Long> selectByName(String name) {
		System.out.println(name);
		
		return new ArrayList<Long>();
	} 
	
	
	public char getCharacter() {
		return new Character('a');
	}
	
	// boxing : 기본 자료형을 객체로 만드는것.
	// auto boxing : 자동으로 기본자료형을 객체로 만드는것.
	// ex) Character c2 = 'a'
	// auto unboxing : 자동으로 객체를 기본 자료형으로 만드는것.
	// ex) char c2 = new Character('a')
	
	
	public Dog getDogBySsn(String ssn){
	    return new Dog();
	}
	
	
	public HashMap<String, Dog> getDogsByPage(int page) {
		return new HashMap<String, Dog>();
	}
	
	
	public int[][][][] getArray() {
		int[][][][] arr = new int[3][2][3][4];
		
		return arr;
	}
	
	
	public Dog getDogInArray(int index) {
		Dog[] arr = {new Dog(), new Dog(), new Dog()};
		return arr[index];
	}
	
	
}
