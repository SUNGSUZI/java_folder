package com.naver;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public void me1() {
		List<Integer> list = new ArrayList<Integer>();
		int size = list.size();
		System.out.println(size);
		// list에 요소 추가
		list.add(10);
		list.add(20);
		list.add(100);
		// list 크기확인
		size = list.size();
		System.out.println(size);
		
		// 인덱스로 list 안의 요소 가져오기
		int num = list.get(list.size()-1);
		System.out.println(num);
		
		
		for(int n : list) {
			System.out.println(n);
		}
		
		System.out.println(":::::::::::");
		
		for(int i = list.size()-1; i>=0; i--) {
			int n = list.get(i);
			System.out.println(n);
		}
		
		list.remove(0);
		list.remove(1);
		System.out.println(list);
	}	
	
	public void me2() {
		List<String> list = new ArrayList<String>();
		
		int size = list.size();
		System.out.println(size);
		
		list.add("hello");
		list.add("hello");
		list.add("world");
		list.add("world");
		list.add("good");
		list.add("morning");
		
		size = list.size();
		String msg = list.get(size-1);
		System.out.println(msg);
		
		
		for(String str:list) {
			System.out.println(str);
		}
		
		for(int i = size-1; i>=0; i--) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		list.remove(0);
		list.remove(1);
		
		System.out.println(list);
		
		list.stream().forEach(n->System.out.println(n));
		list.stream().map(String::toUpperCase).forEach(n -> System.out.println(n));
		// Stream은 순차적으로 3가지 작업
		// 스트림 생성 -> 중간연산 -> 최종연산
	}
	
	public void me3() {
		List<Dog> list = new ArrayList<Dog>();
		
		
		System.out.println(list.size());
		list.add(new Dog());
		list.add(new Dog(1,"a"));
		list.add(new Dog(2,"b"));
		list.add(new Dog(3,"c"));
		list.add(new Dog(4,"d"));
		
		System.out.println(list.size());
		Dog dog0 = list.get(0);
		
		for(int i=list.size()-1; i>=0;i--) {
			Dog dog = list.get(i);
			System.out.println(dog);
		}
		
		for(Dog dog :list) {
			System.out.println(dog);
		}
		
//		list.stream().filter().map(dog -> dogl.getName);
	}
	
	public void me4() {
		// List<String> 객체를 저장할 수 있는 List객체인 list 생성.
		List<List<String>> list = new ArrayList<List<String>>();
	}
}
