package com.naver;

public class Process1 {
	public void start() {
		Test01 t1 = new Test01();
		t1.a = 100;
		
		Test01.InnerTest1 it1 = t1.new InnerTest1();
		it1.bb = 200;
		it1.iner_me1();
		
		Test01.InnerTest1 it2 = new Test01().new InnerTest1();
		it2.bb = 300;
		it2.iner_me1();
		
		
	}
}
