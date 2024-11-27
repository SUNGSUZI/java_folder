package com.samsung;

public class Dog {
	public  void test21(int num) {
		// 반복문은 조건식이 true일때, 반복문 본문을 실행합니다.
		// do ~ while문은 조건식이 거짓이어도 한번은 반드시 반복문 본문이 실행됩니다.
		do {
			System.out.println("hello" +num);
			++num;
		} while(num<10);
	}
}
