package kr.co.mbc;

import com.naver.Dog;
import com.naver.Item;
import com.naver.Member;

public class MainEx {

	public static void main(String[] args) {
		Member kim = new Member();
		kim.me2();
		//kim.me2_1();
		
		Item item = new Item();
		item.test2_1();
		
		Dog dog = new Dog();
		dog.k1();
		
		System.out.println(":::");
		dog.k2(12,13);;
		dog.k3("hello",'c');
		
	}
}
