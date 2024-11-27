package com.naver;

import java.util.Objects;

public class Animals extends Object{
	private int id;
	private String name;
	private final String KIND;
	
	public Animals() {
		super();
		KIND = "개";
	}
	public Animals(int id, String name, String KIND) {
		super();
		this.id = id;
		this.name = name;
		this.KIND = KIND;
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
	public String getKind() {
		return KIND;
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
		Animals other = (Animals) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Animals [id=" + id + ", name=" + name + ", KIND=" + KIND + "]";
	}
	
	public final void me1() {
		System.out.println("자식클래스에서 절대로 오버라이딩하면 안되는 메서드");
	}
	
	public void me2() {
		System.out.println("오버라이딩하든 안하든 상관 없는 메서드");
	}
	
	
	
	
}
