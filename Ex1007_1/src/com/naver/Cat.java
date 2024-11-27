package com.naver;

// 자바의 클래스는 단일상속만 합니다.
// 자바는 단일상속을 원칙으로 합니다.
// 인터페이스는 다중상속을 지원합니다.
public class Cat extends Animals {
	public Cat() {}

	public Cat(int id, String name,String kIND) {
		super(id, name,kIND);
		// TODO Auto-generated constructor stub
	}
	
	
	
//	오버라이딩하면 exception(예외)발생함.
//	@Override
//	public void me1() {
//		System.out.println("ㅎㅎㅎ");
//	}

	
	
	@Override
	public void me2() {
		System.out.println("ㅎㅎㅎ");
	}
}
