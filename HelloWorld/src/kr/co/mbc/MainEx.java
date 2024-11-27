package kr.co.mbc;

public class MainEx {
	public static void main(String[] args) {
		/*자바에서 자료형(type)은 참조자료형, 기본자료형으로 나뉘어짐.*/
		// 참조자료형
		// 기본자료형이 아닌 자료형
		// 값이 저장된 주소를 변수가 갖고 있는 자료형
		// 자료형 변수명 = 자료형에 맞는 값;
		String msg = new String("hi"); //객체 생성
				
		// 
		StringBuffer sb = new StringBuffer("ddddd");
		System.out.println(sb);
		
		// 기본 자료형
		// 변수의 값이 직접적으로 저장되는 자료형
		// boolean : true/false
		// char : 'a', 작은 따옴표 안에 한 글자만 적음.
		// byte : 1바이트 할당 받음. 8비트, 1비트(부호비트) | 7비트 -128~127까지 표현(대소문자 구분함.)
		// short :2바이트 할당 받음. 16비트, 1비트(부호비트) | 15비트로 숫자를 표현
		// int : 4바이트 할당 받음. 32비트, 1비트(부호비트) |- 21억 ~ 21억
		// long : 8바이트 할당 받음. 64비트,1비트(부호비트) | 63비트로 숫자.. 숫자 뒤에 L/l을 붙임.
		// float : 실수형, 정밀하지 않은 실수 표현시 4바이트 할당. 어떤값이든 다표현.
		// dobule : 실수형, 정밀하게 실수 표현시 8바이트 할당, 어떤값이든 다표현 실수형의 기본자료형.
		int num = 10;
		
		
		
		boolean b1 = true; // true / flase 중 하나만 값으로 사용 할 수 있음.
		boolean b2 = false;
		
		char c1 = 'a'; // 작은 따옴표 안에 한 글자만
		char c3 = '○';
		
		byte by1 = -128; // -128~127까지만 표현 가능.
		byte by2 = 127;
		
		short s= 1; // 의미 없는 자료형
		
		int i1 = -2100000000; // 약 -21억~21d억 사이를 표현함. 정수형의 기본 자료형
		int i2  = 2100000000;
		
		long l1 = -220000000L; // 숫자 뒤에 L/l을 입력해야함.
		long l2 = 2200000000L;
		
		float f1 = 3.14f; // 실수 뒤에 F/f를 입력해야함.
		 
		double d1 = 3.14; // 실수형의 기본 자료형 
		
		String msg2 = new String("hello");
		StringBuffer sb2 = new StringBuffer("good");
		
		
			
		
		
	}
}
