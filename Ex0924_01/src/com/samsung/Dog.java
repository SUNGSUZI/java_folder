package com.samsung;

public class Dog {
	boolean b1 = true;
	boolean b2 = false;
	char c1 = 'a';
	byte by1 = -128;
	byte by2 = 127;
	short s1 = 0;
	int i1 = -2100000000;
	int i2 = 2100000000;
	long l1 = -2200000000L;
	long l2 = 2200000000L;
	float f1 = 3.14F;
	double d1 = 3.14;
	String name = new String("팽이");
	StringBuffer sb = new StringBuffer();
	
	// 생성자
	public Dog() {
		System.out.println(new String("디폴트 생성자입니다."));
	}
	
	public void me1() { // 무반환 무매개
		System.out.println("개가 달립니다.");
	} 
	
	public void me2(String name) { // 무반환 유매개
		System.out.println(name + "(이)가 달립니다.");
	}
	
	public int me3() { // 유반환 무매개
		// 반환형 : 반환되는 데이터의 자료형
		System.out.println("좋아하는 숫자를 반환합니다.");
		return 1;
	}
	
	public String me4(String to) { // 유반환 유매개
		System.out.println( "개가 " + to + "로 걸어값니다.");
		System.out.println( "걸어가는 속도를 반환합니다.");
		
		return new String("60"); 
	}
}
