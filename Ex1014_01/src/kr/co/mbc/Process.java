package kr.co.mbc;

import com.naver.MyThread;

public class Process {
	public void start() {
		// 스레드 인스턴스(=객체)
		// 스레드가 아님.
		MyThread mt1 = new MyThread(1);
		mt1.start();
		
		MyThread mt2 = new MyThread(5);
		mt2.start();
	}
}
