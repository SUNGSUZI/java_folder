package com.naver;

import java.util.Objects;

public class Dog implements Comparable<Dog>{
	private int id;
	private String name;
	
	
	
	public Dog() {
		super();
	}




	public Dog(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
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
		Dog other = (Dog) obj;
		return id == other.id;
	}




	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}




	@Override
	public int compareTo(Dog o) {
		if(this.getId() > o.getId()) {
			return -1;
		}else {
			return 1;
		}
	}
	
	

}
