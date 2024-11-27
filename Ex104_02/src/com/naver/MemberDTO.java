package com.naver;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MemberDTO implements Serializable{// 직렬화

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String id;
	public String name;
	public int age;
	
	
	
	public MemberDTO() {
		super();
	}



	public MemberDTO(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public MemberDTO(Builder builder) {
		this.id = builder.id;
		this.name =  builder.name;
		this.age = builder.age;
	
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



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

	public static class Builder{
		public String id;
		public String name;
		public int age;
		
		public Builder() {}

		public Builder setId(String id) {
			this.id = id;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public MemberDTO build() {
			return new MemberDTO(this);
		}
		
	}
}
