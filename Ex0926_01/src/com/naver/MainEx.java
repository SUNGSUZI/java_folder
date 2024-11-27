package com.naver;

import com.samsung.ComplexOper;

public class MainEx {

	public static void main(String[] args) {

		ComplexOper co = new ComplexOper();
		
		co.pe(3, 6);
		co.se(6, 2);
		co.me(100, 100);
		co.de(100, 10);
		int result = co.re(5,2);
		System.out.println(result);
	}

}
