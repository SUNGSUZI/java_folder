package com.naver;

import java.util.Objects;

public class Member {

	private String id;
	private String name;
	private int age;
	private final String COUNTRY_OF_US;
	public Member() {
		super();
		COUNTRY_OF_US = "한국";
		// 생성자에 값을 넣는 행위는 대입이 아닌 초기화이다.
	}
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		COUNTRY_OF_US = "한국";
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
	public String getCOUNTRY_OF_US() {
		return COUNTRY_OF_US;
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
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
