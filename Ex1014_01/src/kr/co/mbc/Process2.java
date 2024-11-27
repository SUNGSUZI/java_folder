package kr.co.mbc;

import com.naver.MyRunnable;

public class Process2 {
	public void start() {
		MyRunnable mr1 =  new MyRunnable(7);
		Thread t3 = new Thread(mr1);// thread 인스턴스가 생성이된것. 
		t3.start();
		
		Thread t4= new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("통신코드");
			}
		});
		t4.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("여기도 통신 코드");
			}
		}).start();
	}
}
