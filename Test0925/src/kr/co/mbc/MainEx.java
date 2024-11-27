package kr.co.mbc;

import com.samsung.Dog;
import com.samsung.Member;

public class MainEx {

	public static void main(String[] args) {
		
		Member hong = new Member("m1", "홍길동", 16, new Dog());
		Member kim = new Member("m2", "김유신", 19, new Dog());
		Member lee = new Member("m3", "이순신", 29, new Dog());

		String name = hong.getName();
		int age = kim.getAge();
		String id = lee.getId();
		Dog dog = hong.getDog();
		System.out.println(dog);
		
		String dogName = dog.getName();
		System.out.println(dogName);
		
		String kimDogName = kim.getDog().getName();
		System.out.println(kimDogName);
		
	}
}
