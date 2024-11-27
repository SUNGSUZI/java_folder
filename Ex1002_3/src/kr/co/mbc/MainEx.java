package kr.co.mbc;

import java.util.Scanner;

import com.naver.Animals;
import com.naver.Dog;
import com.naver.Member;

public class MainEx {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.run();
		
		Animals dog2 = new Dog();
		dog2.run();
		
		System.out.println("::::::::");
		Member gunin = new Member();
		boolean isTrue = true;
		Scanner sc = new Scanner(System.in);
		
		while(isTrue) {
			System.out.println("명령을 선택하세요.");
			System.out.println("1:공격, 2 :게임종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu ==2) {
				isTrue = false;
				
			}else {
				gunin.attack(sc);
			}
			
		}
		
	}


}
