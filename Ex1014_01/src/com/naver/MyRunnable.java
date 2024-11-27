package com.naver;

public class MyRunnable implements Runnable { 
	// Thread는 클래스이기 때문에 implements로 다형성을 제공하지 못함.
	// Runnable은 Thread의 run메소드를 인터페이스로 제공함
	private int id;
	public MyRunnable() {}
	
	
	
	
	public MyRunnable(int id) {
		super();
		this.id = id;
	}




	@Override
	public void run() {
		for(int i =0;i<100;i++) {
			System.out.println(id);
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
