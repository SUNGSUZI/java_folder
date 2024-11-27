package com.naver;

import java.util.Scanner;

public class Dog {
	public  void test21(int num) {
		// 반복문은 조건식이 true일때, 반복문 본문을 실행합니다.
		// do ~ while문은 조건식이 거짓이어도 한번은 반드시 반복문 본문이 실행됩니다.
		do {
			System.out.println("hello" +num);
			++num;
		} while(num<10);
	}
	
	// while문 학습
	// 0~10까지 출력
	public void test31() {
		int num = 0;
		
		while(num < 11) {
			num++;
			System.out.println(num);
			
		}
	}
	
	public void test32() {
		int num = 0;
		long start = System.currentTimeMillis();
		
		while(num <= 322) {
			if(num%2 == 0) {
				System.out.println(num);
			}
			num++;
			
		}
		long end = System.currentTimeMillis();
		System.out.println(end- start);
	}
	
	public void test322() {
		int num = 0;
		long start = System.currentTimeMillis();
		
		while(num <= 322) {
			System.out.println(num);
			num+=2;
			
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end- start);
	}
	
	public void test33() {
		int num = 26;
		while(num <= 2002) {
			System.out.println(num);
			num+=13;
		}
		
	}
	
	public void test34(int end) {
		int num = 0;
		while(num <= end) {
			System.out.println(num);
			num++;
		}
		
	}
	
	public void test35(int start, int end) {
		int num = start;
		while(num <= end) {
			System.out.println(num);
			num++;
		}
	}
	
	// 
	public void test36() {
		int result = 1;
		while(result <= 894) {
				System.out.println(result);
				result*=3;
		}
	}
	
	public void test37() {
		int i = 1; 
		while(i <= 9) {
			System.out.println("3x"+i+"="+3*i);
			i++;
		}
	}
	
	public void test372() {
		// %d: 정수, $s: 문자열 , %f: 실수
		int i = 1; 
		while(i <= 9) {
			String msg = String.format("%d X %d = %d", 3, i, 3*i);
			System.out.println(msg);
			i++;
		}
	}
	
	
	public void printDan(int dan) {
		int num = 1;
		while (num <10) {
			System.out.println(String.format("%d X %d = %d", dan, num, dan*num));
			num++;
		}
	}
	
	
	
	// 다중반복문 => 단일 반복문으로 변환
	public void printAll(){
		int dan =2;
		while(dan < 10) {
			System.out.println(dan + "단을 출력함");
			printDan(dan);
			++dan;
		}
		
		int num =1;
		while(num < 10) {
			String msg = String.format("%d x %d = %d", dan, num , dan*num);
			System.out.println(msg);
			
			++num;
		}
	}
	
	
	public void test40(int skip) {
		int i =0;
		while(i < 10) {
			
			if(i == 3) {
				i++;
				continue; // 다시 while문으로 
				// 고로 continue 위에 i값을 증가, 
				// 증가하지 않으면 무한 루프
			}
			
			System.out.println(i);
			
			i++;
		}
	}
	
	public void test41(int skip) {
		// 0~10까지 출력함.
		// 단, skip은 출력하지 마세요.
		int i =0;
		while(i< 11) {
			if(i!=skip) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public void test51() {
		int i= 0;
		
		while(i > 10) {
			if(i > 5) {
				break;
			}
			System.out.println(i);
			++i;
			
		}
		System.out.println("While문을 빠져나왔음.");
	}
	
	public void test52() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력하고 싶은것을 적으세요.");
			String msg = sc.nextLine(); // enter를 치기전까지 가지고 있다가 enter를 치면 msg에 넣음.
			if(msg.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println(msg);
		}
		sc.close();
	}
	
	
	
	
	// scanner -> 키보드 값을 이볅 받을 때 사용함.
	// equals -> 잠조형 자료형의 값을 비교.
	// break 문은 가장 가까운 반복문을 빠져나옴
	public void test53() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력하고 싶은것을 적으세요.");
			String msg = sc.nextLine(); // enter를 치기전까지 가지고 있다가 enter를 치면 msg에 넣음.
			if(msg.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println(msg);
		}
		sc.close();
	
	}
	
	
	public void test54() {
		int i = 0;
		int check = 4;
		
		
		if(i== check) {
			
		}
		
	}
	
	
}
