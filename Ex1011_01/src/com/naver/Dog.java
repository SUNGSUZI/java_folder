package com.naver;

public class Dog<K, V> { // 제네릭 클래스 두개의 제네릭 타입을 설정하고 싶으면 K,V (제네릭타입)이라고 함.
						 // 하나의 타입만 나타내려면 Type의 약자 T를 넣으면 됨
	private K id;
	private V name;
	
	public Dog() {
		
	}
	
	public void me1() {
		System.out.println(id);
	}
	
}
