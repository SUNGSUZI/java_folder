package com.naver;

public class Process2 {
	
	public void start() {
		A animal = A.PIG;
		System.out.println(animal);
		System.out.println(animal.getClass());
		System.out.println(animal.name());
		System.out.println(animal.getName());
		animal = A.valueOf("CAT");
		System.out.println(animal);
		
		// enum의 모든 상수 출력
		System.out.println("::::::::");
		A[] arr = A.values();
		for(A el : arr) {
			System.out.println(el);
		}
	}
}
