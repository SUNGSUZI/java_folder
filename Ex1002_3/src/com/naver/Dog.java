package com.naver;

import java.util.Date;

public class Dog extends Animals{


	@Override
	public void run() {
		System.out.println("개가 달립니다.");
	}

	@Override
	public void sleep() {
		System.out.println("개가 잡니다.");
	}
	
	
	@Override
	public void attack() {
		System.out.println("이빨로 물어 뜯습니다.");
		
	}
	
}
