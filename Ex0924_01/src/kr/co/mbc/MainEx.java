package kr.co.mbc;

import com.samsung.Cat;
import com.samsung.Dog;
import com.samsung.Member;
import com.samsung.Monster;

public class MainEx {
	public static void main(String[] args) {
		// Dog 클래스를 이용해서 Dog 객체를 만들어 보겠습니다.
		// Dog 클래스는 기본 자료형?, 참조자료형?
		// 참조자료형이다.
		// 참조자료형의 변수를 객체라고 함.
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		
		d2.me1();
		d3.me2(new String("홍길동"));
		
		
		int result = d1.me3();
		System.out.println(result);
		
		
		String result2 = d2.me4(new String("여의도"));
		System.out.println(result2);
		
		
		System.out.println(":::::Cat");
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		
		// 
		c1.k1();
		c2.k2(new String("고양이"));
		
		int result3 = c1.k3();
		System.out.println(result3);
		
		char result4 = c1.k4(new String("2024"));
		System.out.println(result4);
		
		
		// monster 객체 2개 생성
		Monster mon1 = new Monster();
		Monster mon2 = new Monster();
		
		Cat cat1 = new Cat();
		cat1.setName("c1 고양이");
		mon2.attack(c1);
		
		
		
		// member 객체
		Member mem1 = new Member("m002", "홍길동", 21); 
		
		
		Member mem2 = new Member();
		mem2.setId(new String("m001"));
		mem2.setName(new String("홍길동"));
		mem2.setAge(22);
		
		
		
	}
}
