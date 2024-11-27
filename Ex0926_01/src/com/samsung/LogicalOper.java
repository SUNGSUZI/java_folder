package com.samsung;

public class LogicalOper {
	// &&, ||, !(not)
	//논리연산자, 비교연산자를 이용한
	//연산의 결과는 무조건 boolean으로
	//나옴.. true/false
	
	public void not(boolean a) {
		System.out.println(!a);
	}
	
	public boolean or(boolean a, boolean b) {
		boolean result = a || b;
		return result;
	}
	
	public void and(boolean a, boolean b) {
		boolean result = a && b;
		System.out.println(result);
	}
	
}
