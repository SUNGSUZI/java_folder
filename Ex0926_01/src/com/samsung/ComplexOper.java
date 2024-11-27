package com.samsung;

public class ComplexOper {
	
	public void pe(int a, int b) {
		System.out.println(a += b); //a = a+b
	}
	
	public void se(int a, int b) {
		System.out.println(a-=b); // a = a-b
	}
	
	public void me(int a, int b) {
		System.out.println(a*=b); // a= a*b
	}
	
	public void de(int a, int b) {
		System.out.println(a/=b); // a= a/b
	}
	
	public int re(int a, int b) {
		return a%=b; // a = a%b 
	}
}
