package com.naver;

public class Cat implements Comparable<Cat>{
	private String id;
	private String name;
	
	
	public Cat() {
		super();
	}
	public Cat(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Cat o) {
		return this.getId().compareTo(o.getId())*(-1);
	}
	
	
	
}
