package com.samsung;

public class InDeOper {
	
	public int num1;
	public int num2;
	
	
	public void rv() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1++);
		System.out.println(num2--);
		System.out.println("rv.............");
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public void fv() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(++num1);
		System.out.println(--num2);
		System.out.println("fv.............");
		System.out.println(num1);
		System.out.println(num2);
	
		
	}
}
