package com.naver;

public class Test02 {
	public static int a = 10;
	
	public static class InnerTest2{
		public int bb =10;
		
		public void inner_me2() {
			System.out.println("스태틱내부 클래스");
		}
	}
	
	public class InnerTest22{
		public static int cc = 30;
		
	}
}
