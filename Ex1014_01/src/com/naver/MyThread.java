package com.naver;

public class MyThread extends Thread {
	// 스레드 클래스 생성
	// thread를 상속 받아야 함.
	
	private int id;
	
	
	
	public MyThread() {
		super();
	}



	public MyThread(int id) {
		super();
		this.id = id;
	}



	// cpu를 할당 받으면 running 상태
	// 아니면 runout 상탱
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(id);
			try {
				Thread.sleep(100); // 1초가 1000, sleep은 cup할당을 해당 시간동안 멈추는것. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
