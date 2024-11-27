package kr.com.mbc;

import com.samsung.MathOper;

public class MainEx {
	public static void main(String[] args) {
		
		MathOper mo = new MathOper();
		System.out.println(mo.plus(12, 12));
		
		
		String msg = mo.plus("hi", "world");
		System.out.println(msg);
		
		msg = mo.plus("hello", 5);
		System.out.println(msg);
		
		mo.sub(3, 2);
		
		mo.mul(2100000000, 2);
		
		mo.div(3, 2);
		
		mo.remain(4, 1);
	}
}
