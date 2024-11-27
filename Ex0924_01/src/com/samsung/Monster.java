package com.samsung;

public class Monster {

	public Monster() {}
	
	public void attack(Cat cat) {
		System.out.println("괴물이 고양이를 공격합니다.");
		System.out.println("공격다하는 고양이의 이름은?");
		System.out.println(cat.name);
	}
	
	
}
