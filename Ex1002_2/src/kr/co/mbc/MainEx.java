package kr.co.mbc;

import com.naver.Animals;
import com.naver.Dog;

public class MainEx {

	public static void main(String[] args) {
		Dog dog0 = new Dog(0,"A",null, 20);
		Animals dog1 = new Dog(1,"a",null,10);
		
		
		int dog0Id = dog0.getId();
		String dog1Name = dog1.getName();
		System.out.println(dog1Name);

		int dog0Price = dog0.getPrice();
		System.out.println(dog0Price);
		
		// 다형성으로 객체를 생성하면, 자식 클래스가 갖고 있는 
		// 고유한 자원(부모클래스에는 없고 자식에만 있는 자원)을 직접적으로 호출할 수 없음.
		//Animals cat1 = new Cat(2, "b", null, "2");
		// dog1.getPrice(); // 다형성의 단점으로 인해 불가
		Class clazz0 = dog0.getClass();
		Class clazz1 = dog1.getClass();
	
		System.out.println(clazz0 == clazz1);
		
		Dog other = null;
		if(dog1.getClass() == Dog.class) {
			other = (Dog)dog1;
			int price2 = other.getPrice();
			
			System.out.println(price2);
		}
		
	}


}
