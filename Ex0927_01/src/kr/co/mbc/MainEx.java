package kr.co.mbc;

import com.samsung.Dog;
import com.samsung.Member;

public class MainEx {

	public static void main(String[] args) {
		Member kim = new Member("kim","kim",20,new Dog());
	
		kim.test1(100);
		System.out.println(":::::::::::::::::");
		kim.test1(91);
		System.out.println(":::::::::::::::::");
		kim.test1(81);
		System.out.println(":::::::::::::::::");
		kim.test1(71);
		System.out.println(":::::::::::::::::");
		kim.test1(61);
		System.out.println(":::::::::::::::::");
		kim.test1(51);
		
		
		
		kim.test12(8);
		kim.test12(2);
		
		
		kim.test13("a");
		kim.test13(new String("b"));
		
		kim.test14(65+32); // 65는 'A' 97은 'a' (아스키 코드값)
		
		
	}

	
}
