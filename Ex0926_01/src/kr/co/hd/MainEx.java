package kr.co.hd;

import com.samsung.CompOper;
import com.samsung.LogicalOper;

public class MainEx {
	
	//LogicalOper객체의 메인 메소드
	public static void main(String[] args) {
		
		LogicalOper lo = new LogicalOper();
		
		lo.and(true, false);
		lo.and(false, false);
		
		System.out.println(">>>>>>>>>>>>>>");
		
		System.out.println(lo.or(true, false));
		System.out.println(lo.or(false, false));
		
		System.out.println(">>>>>>>>>>>>>>");
		
		lo.not(false);
		
		System.out.println("::::::::::::::::::::::");
		
		CompOper co = new CompOper();
		co.gt(6,5);
		co.gt(1,5);
		
		System.out.println(co.ge(6,5));
		System.out.println(co.ge(5,5));
		
		co.lt(1, -1);
		co.le(1, -1);
		
		co.e(-1, -1);
		
		co.ne(-1, 0);
		co.ne(0, 0);
	}

}
