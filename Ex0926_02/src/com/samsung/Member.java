package com.samsung;

public class Member {
	private String id;
	private String name;
	private int age;
	private Dog dog;
	
	private Cat cat;
	private Cat cat2;

	public Member() {}
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	public Member(String id, String name, int age, Dog dog, Cat cat, Cat cat2) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dog = dog;
		this.cat = cat;
		this.cat2 = cat2;
	}



	public Member(String id, String name, int age, Dog dog) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dog = dog;
	}
	
	
	// 다중 if문
	// if ~else if ~else
	// if ~else if ~else if
	// 수우미양가 예제
	public void test21(int score) {
		
		if(score >=90) { // score의 값이 90보다 크거나 같으면 "수"
			System.out.println("수");	
		}else if(score >=80) { // score의 값이 90보다 크거나 같으면 "우"
 			System.out.println("우");
		}else if(score >=70) { //score의 값이 90보다 크거나 같으면 "미"
			System.out.println("미");
		}else if(score >=60) { // score의 값이 60보다 크거나 같으면 "양"
			System.out.println("양");
		}else if(score < 60) { // score의 값이 60미만이면 "가" 
			//else로만 했을때보다 속도가 더 빠름. 
			System.out.println("가");
		}
		
	}
	

	public int test22(int month) {
		
		int dayInfo = 31; 
		if(month == 2) {
			dayInfo = 28;
		}else if(month == 4 || month == 6 || month == 9 ||month == 11) {
			dayInfo = 30;
		}
		return dayInfo;
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
