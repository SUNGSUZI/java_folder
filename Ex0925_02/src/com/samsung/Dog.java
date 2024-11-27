package com.samsung;

public class Dog {
	
	private int num; // 인스턴스 변수
	public static int num2; // static(클래스) 변수
	
	public Dog() {}

	
	public Dog(int num) {
		this.num = num;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public long getAge(){
	    return 2200000000L;
	}
	
	
	
}
