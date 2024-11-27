package kr.co.mbc;

import com.naver.ChildInter;
import com.naver.Inter1;
import com.naver.Test;

public class MainEx {

	
	public static void main(String[] args) {
		int a = Inter1.A;
		
//		Inter1 i1 = new Inter1();
//		interface로 진짜 객체 만들지 않음.
//		class 기준으로 interface는 양부모 개념
		
		ChildInter t1 = new Test();
		t1.me1();
		t1.me2();
		
		a = ChildInter.A;
	}
}
