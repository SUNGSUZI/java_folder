package com.naver;

public class Test03 {
	
	public void me1() {
		System.out.println("me1메서드");
		
		// 메서드 안에는 직접적으로 메서드를 생성할 수 없습니다.
		// 메서드 안에 간접적으로 메서드를 생성 할 수 있음.
		
		
		int a =10;
		
		// 멤버내부클래스
		// 스태틱내부클래스
		// 로컬(지역)내부클래스
		class InnerTest3{
			public  void inner_me3() {
				System.out.println(a);
			}
		}
		
		InnerTest3 it3= new InnerTest3();
		it3.inner_me3();
		
	}
}
