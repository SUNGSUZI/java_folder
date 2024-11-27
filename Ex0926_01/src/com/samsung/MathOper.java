package com.samsung;

public class MathOper {
	
	public void remain(int a, int b) {
		System.out.println(a%b);
	}
	
	public void div(int a, int b) {
		System.out.println(a/b);
	} 
	
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public String plus(String str1, int a) {
		return str1 + a;
	}
	
	public String plus(String str1, String str2) {
		return str1+ str2;
	}
	
	
	public int  plus(int a, int b) { 
		
		
		return a + b; // 자료형의 표현 범위를 넘는것 overflower
					  // 쵸현 범위보다 작으면 underflower 
	}
}
