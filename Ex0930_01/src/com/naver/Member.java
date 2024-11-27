package com.naver;

public class Member {

	private String id;
	private String name;
	private int age;
	
	public Member() {
	}

	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override // 상속
	public String toString() {
		return this.id + " :" + this.name;
	}
	
	public int test1() {
		//for문 학습
		
		for(int i=0; i<10;i++){
			String msg = String.format("hello %d", i);
			System.out.println(msg);
		}
		
		return 2100000000;
	}
	
	public void test2() {
		for(int i=20 ; i<31; i++) {
			System.out.println(i);
		}
	}
	
	public void test21(int end) {
		// for(초기값 ; 범위값; 증감값){
		//     실행코드
		// }
		for(int i=0; i < end+1; i++) {
			System.out.println(i);
		}
	}
	
	public void test3() {
		for(int i=10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public void test41() {
      int[] arr = {1,2,5,7};
      for(int i= 0; i< arr.length;i++) {
    	  System.out.println(arr[i]);
      }
   }
	
	public void test42() {
		for(int i =1; i< 10; i++) {
			System.out.println(String.format("3 X %d = %d", i, (3*i)));
		}
	}
	
	public void printDan(int dan) {
		for(int i =1; i< 10; i++) {
			System.out.println(String.format("%d X %d = %d", dan, i, dan*i));
		}
	}
	
	public void gugudan() {
		for(int i =2; i<10; i++) {
			printDan(i);
			System.out.println(":::::::::::::");
		}
	}
	
	public void test43() {
		for(int i =0; i<18;i++) {
			System.out.println(i/3);
		}
	}
	
	public void test5() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(i*j);
			}
		}
	}
	
	public void test6(int skip) {
		for(int i =0; i<10;i++) {
			if(i == skip) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void test7(int skip) {
		for(int i =0; i<10;i++) {
			if(i == skip) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("...............");
	}
	
}
