package com.naver;

public class Sum {

	public int num;
	
	public int num2;
	
	public int num3;
	
	Object key1 = new Object();
	Object key2 = new Object();
	
	public void plusNum3(int i) {
		synchronized (key1) {
			num3 = num3 +i; // 같은 변수를 사용하는거면 하나의 키를 사용해야 최적화가 가능함.
		}
	}
	public void minusNum3(int i) {
		synchronized (key1) {
			num3 = num3-i;
		}
	}
	
	public void minusNum2(int i) {
		synchronized (this) { // num3와 num2는 다른 키를 쓰고 있음.
			num2 = num2-i;
		}
	}
	
	public void plusNum(int i ) {
		this.num = this.num +i;
	}
	
}
