package com.naver;

import java.util.Objects;

public class Member extends Object{
	private String id;
	private String name;
	private int age;
	private final String CONTRY_OF_US;
	
	public Member() {
		int a = Inter1.A;
		
		CONTRY_OF_US = "한국";
	}

	public Member(String id, String name, int age, String cONTRY_OF_US) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		CONTRY_OF_US = cONTRY_OF_US;
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

	public String getCONTRY_OF_US() {
		return CONTRY_OF_US;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CONTRY_OF_US, age, id, name);
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
		return Objects.equals(CONTRY_OF_US, other.CONTRY_OF_US) && age == other.age && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", CONTRY_OF_US=" + CONTRY_OF_US + "]";
	}
	
	
}
