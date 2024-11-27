package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
	
	public void k3() {
		//Set 객체 set을 선언합니다.
		// 제네릭타입은 Dog입니다.
		Set<Dog> set = new HashSet<Dog>();
		set.add(new Dog());
		set.add(new Dog(1,"name1"));
		set.add(new Dog(2,"name1"));
		
		Iterator<Dog>it =  set.iterator();
		List<Dog> list = new ArrayList<Dog>();
//		while(it.hasNext()) {
//			Dog el = it.next();
//			list.add(el);
//			
//		}
//		Collections.so
		
		list = set.stream().collect(Collectors.toList());
//		list.forEach(System.out::println); // :: 메서드 참조
		Collections.sort(list);// dog 클래스에 implements  Comparable<Dog>추가
		System.out.println(list);
		
	}
	
	public void k2() {
		Set<String> set = new HashSet<String>();
		
		set.add("hello");
		set.add("hello1");
		set.add(new String("hello1")); // 참조자료형은 동등성비교
		set.add("hello2");
		set.add("hello2");
		
		System.out.println(set.size());
		
		List<String> list = new ArrayList<String>();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			list.add(it.next());	
		}
		
		System.out.println(list);
		
		System.out.println("::::::::::");
		
		Collections.sort(list);
		List<String>list2 = list.reversed();
		
		System.out.println(list2);
		System.out.println("::::::::::");
		
	}
	public void k1() {
		// set : 중복을 하지 않는다.
		Set<Float> set = new HashSet<Float>();
		int size = set.size();
		System.out.println(size);
		
		set.add(3.14F);
		set.add(31.4F);
		set.add(9.8F);
		set.add(9.8F);
		set.add(4.27F);
		set.add(4.27F);
		size = set.size();
		System.out.println(size);
		System.out.println(set);
		
	
		
		List<Float> list = new ArrayList<Float>();
		
		
		Iterator<Float> it= set.iterator();
		while(it.hasNext()) {
			Float el = it.next();
			System.out.println(el);
			list.add(el);
			
		}
		System.out.println(list);
		
		set.forEach(System.out::println);
		List<Float> list2 = set.stream().collect(Collectors.toList());
		System.out.println(list2
				);
		
		
		set.remove(9.8F);
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}

}
