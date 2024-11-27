package com.naver;

public class Cat extends Animals{

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {

		System.out.println("냥냥펀치/////");
	}

	@Override
	public void run() {
		System.out.println("밀림의 사자처럼 달립니다.");
	}

	@Override
	public void sleep() {
		System.out.println("고양이가 잡니다.");
	}

	
}
