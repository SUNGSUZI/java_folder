package kr.com.mbc;

import com.samsung.Dog;
import com.samsung.Member;

public class MainEx {
	public static void main(String[] args) {
		// Member클랙스로 변수/객체/인스턴스를 3ro
		// kim. lee. park이라는 변수 /객체 /인스턴스를 생성
		Member kim = new Member("m01", "김", 16, new Dog());
		Member lee = new Member("m02", "이", 20 , new Dog());
		Member park = new Member("m03", "박", 25, new Dog());
	
		int age = kim.getAge(); // this.age의 this는 kim 객체를 가르킴.
		age = lee.getAge(); // this.age의 this는 lee 객체를 가르킴.
		age = park.getAge(); // this.age의 this는 park의 객체를 가르킴.
		
		System.out.println("::::::::::");
		// Dog 클래스를 이용해서 d1, d2 인스턴스를 생성하세요.
		 Dog d1 = new Dog(1);
		 Dog d2 = new Dog(2);
		
		d1.setNum(100);
		
		int num_d1 = d1.getNum();
		int num_d2 = d2.getNum();
		System.out.println(num_d1);
		System.out.println(num_d2);
		
		int num2_d1 = d1.num2; // num2_d1은 지역변수
		int num2_d2 = d2.num2;
		System.out.println(num2_d1);
		System.out.println(num2_d2);
		
		Dog.num2 = 3;
		num2_d1 = d1.num2;
		d2.num2 = 34;
		num2_d2 = d2.num2;
		System.out.println(">>>>>>>");
		System.out.println(d2.num2);
		System.out.println(d1.num2);
		System.out.println(Dog.num2);
		
	System.out.println(d1.getAge());
		
	}
}
