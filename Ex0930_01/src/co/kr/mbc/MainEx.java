package co.kr.mbc;

import com.naver.Item;
import com.naver.Member;

public class MainEx {

	public static void main(String[] args) {
		Member kim = new Member("m1", "김신", 10);
		
		System.out.println(kim);
		//System.out.println(kim.toString());
		int payback = kim.test1();
		//System.out.println(payback);
		// kim.test2();
		// kim.test21(20);
//		kim.test3();
		kim.test6(5);
		
		Item sosu = new Item();
		
		sosu.me2(12);
		sosu.me3(5);
	}
	
	

}
