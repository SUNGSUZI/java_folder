package com.naver;

public class Process3 {
	public void start() {
//		int sum = 0;
//		for(int i=1; i<10001;i++) {
//			sum = sum + i;
//		}
//		
//		System.out.println(sum);
//		
//		// 결과50005000
		
		
		Sum s= new Sum();
		
		YourThread yt1 = new YourThread(s,1,5000);
		YourThread yt2 = new YourThread(s,5001,10000);
		yt1.setName("1번");
		yt2.setName("2번");
		yt1.start();
		yt2.start();
		
		try {
			yt1.join(); // yt1 스레드가 끝나기 전엔 main 스레드를 실행하지 않는다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			yt2.join();// yt2 스레드가 끝나기 전엔 main 스레드를 실행하지 않는다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// yt1 , yt2의 스레드가 끝나고 나서 main 스레드 s.num이  출력.
		// 하지만 500500이 나오지는 않는다.
		// 단, 위의 사용자 스레드 두개가 실행이 되지 않고 main 스레드락 먼저 실행이 되어
		// 0이 나올 문제는 해결할 수 있음.
		System.out.println(":::::::::::::::");
		System.out.println(s.num);
//		System.out.println(s.num);
		
		
		
		// 우리가 생성한 사용자 스레드가 dead 상태가 되기 전까지
		// 절대로  main 스레드한테 cpu제어권을 넘기지마.
		// 어디에 구현하느냐 main 스레드 영역에 구현함.
		
		// ex)t1사용자 스레드한테 cpu제어권을 넘기지마.
		// => 어디에 구현하는가? t1스레드의 run메서드
		
	}
}
