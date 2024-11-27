package com.naver;

import java.util.Objects;
import java.util.Scanner;

public class Member extends Object{
	
	private String id;
	private String name;
	private int age;
	
	public Animals[] arr;

	public Member() {
		super();
		arr = new Animals[]{new Dog(), new Cat(), new Dog()};
	}
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Member(String id, String name, int age, Animals[] arr) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.arr = arr;
	}
	
	public void attack(Scanner sc) {
		System.out.println("누가 공격하게 할지 선택하세요.");
//		for ( Animals i: arr) {
//			System.out.println(i);
//		}
		for(int i =0; i<arr.length;i++) {
			System.out.println(i+": "+ arr[i]);
		}
		
		int idx = sc.nextInt();
		sc.nextLine();// nextInt 사용 후 nextLine을 사용해야함. 띄어쓰기를 받으려면 nextLine을 씀.
		
		arr[idx].attack();
		
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
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
}
