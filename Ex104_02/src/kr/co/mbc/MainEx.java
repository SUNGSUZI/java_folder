package kr.co.mbc;

import com.naver.MemberDTO;
import com.naver.Process1;
import com.naver.Test2;

public class MainEx {
	public static void main(String[] args) {
		new Process1().start();
		
		Test2 t21 = Test2.getInstance();
		Test2 t22 = Test2.getInstance();
		
		System.out.println(t21== t22);
		
		MemberDTO dto = new MemberDTO("kimyusin", "m001", 10);
		// 순서를 알지 못하는 경우에도 build 할 수 있음.
		MemberDTO dto2= 
				new MemberDTO.Builder()
				.setId("m001")
				.setName("kim")
				.setAge(19)
				.build();
		
		
	}
}
