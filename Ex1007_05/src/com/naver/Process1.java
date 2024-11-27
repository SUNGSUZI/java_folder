package com.naver;

public class Process1 {
	
	public void test(B acmd) {
		switch (acmd) {
		case B.HOTEL:
			System.out.println(B.HOTEL);
			break;
		case B.MOTEL:
			System.out.println(B.MOTEL);
			break;
		case B.INN:
			System.out.println(B.INN);
			break;
		default:
			System.out.println("nn");
			break;
			
		}
	}
	
	
	
	
	public void start() {
		
		int a = 10;
		B acmd = B.HOTEL;// enum 범주형 데이터 // 값이 정해진것
		System.out.println(acmd);
		
		System.out.println(acmd.equals("HOTEL")); // acmd는 enum 형태
		System.out.println(acmd.getClass());
		
		// valueOf메서드 : 문자열을 enum으로 변환
		// enum은 final상수를 대체한다.
		// 아래 코드는 에러가 발생한다.
		// 왜? 상수를 변경하려고 했기에 문제이다.
		// 대문자가 아님
		// B acm = B.valueOf("inn");
		// System.out.println(acm);
		// 옳바른 실행 
		B acm = B.valueOf("INN");
		System.out.println(acm);
		
		// name 메서드 : enum을 문자열로 변환
		String name = acmd.name();
		System.out.println(name);
		System.out.println(name.equals("HOTEL")); // name은 String 형태 고로 ture가 결과값으로 나옴
		
		// ordinal 메서드 : enum의 인덱스 반환
		int idx = acmd.ordinal();
		System.out.println(idx);

		
	}
}
