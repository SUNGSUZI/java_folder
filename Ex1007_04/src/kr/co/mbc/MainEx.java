package kr.co.mbc;

import com.naver.Process1;
import com.naver.Process2;
import com.naver.Process4;
import com.naver.RunnableImpl;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Process1().start();
		new Process2().start();
		new Process4().start();
		
		
//		Thread t0 = new Thread(new RunnableImpl());
//		클래스를 하나 더 만들기 번잡하기에 익명의 내부 클래스 사용.
		Thread t0 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(1111);
			}
		});
	}
}

// Test 클래스는 내부 클래스가 아님
class Test{
	
}
