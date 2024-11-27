package kr.co.mbc;

import com.naver.Process3;

public class MainEx {
	public static void main(String[] args) {
//		System.out.println("시작");
//		new Process().start();
//		new Process2().start();
//		System.out.println("종료");
		// 위의 코드는 무작위로 종료문구를 출력한다.
		// 왜냐면 thread 를 실행시켯기에 cpu 할당을 언제 받을지 모름.
		
		
		// run() 메서드를 통해 실행시킨다면, 스레드는 main 메소드 위쪽에 스택으로 쌓이게 되며, 병행 처리를 하지 못하게 됩니다.
		// 스레드로 병행처리를 하고싶다면 스레드의 start()메서드를 사용해야 정상적으로 스레드 병행 처리를 기대할 수 있다.
		new Process3().start();
	
	
	}
}
