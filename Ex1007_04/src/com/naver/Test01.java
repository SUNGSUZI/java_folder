package com.naver;

public class Test01 {
	// 멤버 변수
	public int a = 10;
	// 멤버내부 클래스
	public class InnerTest1{
		public int bb = 10;
		public void iner_me1() {
			System.out.println("InnerTest1 안에 있는 me1메서드");
		}
	}
}
