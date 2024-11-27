package com.naver;

public class Process2 {
	public void start() {
		Test02 t2 = new Test02();
		t2.a = 100;
		
		Test02.InnerTest2 it2 = new Test02.InnerTest2();
		it2.bb = 200;
		it2.inner_me2();

//		static 클래스가 아니므로 바로 접근 안됨.	
//		Test02.InnerTest22 it3 = new Test02.InnerTest22();
		
		
	}
}
