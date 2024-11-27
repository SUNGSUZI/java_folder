package com.naver;

public class Test04{
	public int a = 10;
	

	public Inter1 i1 = new Inter1() { // 익명의 내부 클래스
		// interface는 자손클래스가 필요함.
		// 왜 익명의 클래스인가? 클래스는 class라는 키워드가 필요함.
		
		@Override
		public void me1() {
			System.out.println("me1메서드입니다.");			
		}
		
		

	};
	public void me2() {
		// 익명의 내부적 클래스 선언 후 뒤에 me1 메서드 호출
		// me2를 호출하면 "어떻게  호츨할거야" 출력이 됨.
		new Inter1() {
			
			@Override
			public void me1() {
				System.out.println("어떻게 호출할거야?");
			}
		}.me1();
	}
	
	
	
	
}
