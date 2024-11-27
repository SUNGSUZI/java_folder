package com.samsung;

public class MainEx {
	public static void main(String[] agrs) {
		InDeOper ido = new InDeOper();
		
		ido.fv();
		
		ido.rv();
		
		// 삼항연산자
		String result = 3>2 ? "hello":"good";
		System.out.println(result);
		
		
		int a = 10;
		int b = 10;
		int c = a >= b ?a*10:0; //"a가 b보다 크거나 같으면 a*10 그렇지 않으면 0";
		System.out.println(c);
		 
		int d = a > b? 3 : a == b? 1:9; //"a가 b보다 크면 3, a가 b와 같으면 1 그렇지 않으면 9"
		
		System.out.println(d);
		
		
			
	}
}
