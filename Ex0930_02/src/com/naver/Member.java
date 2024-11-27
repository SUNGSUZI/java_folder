package com.naver;

public class Member {

	private String id;
	private String name;
	private int age;
	
	
	public Member() {
	}
	
	public Member(String id, String name, int age) {
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
	@Override
	public String toString() {
		return "Member [id="+id+",name="+name+",age="+age+"]";
	}
	
	public void test1() {
		String[] arr= {"1","3","5","7","9"};
		String num = arr[0];
		
		// 배열의 크기를 알아내는 코드
		int size = arr.length;
		System.out.println(size);
		
		// 배열의 값을 바꾸는 코드
		arr[0]="0";
		
		// arr에 들어 있는 요솟값 전체를 출력하세요. 전체, 모든, 전부, 다 ==> 반복문
		int i = 0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
	}
	public void test11() {
		String[] arr= new String[7];
		
		// 배열의 크기를 알아내는 코드
		int size = arr.length;
		//System.out.println(size);
		
		// 배열의 값을 바꾸는 코드
		arr[0]="0";
		
		// arr에 들어 있는 요솟값 전체를 출력하세요. 전체, 모든, 전부, 다 ==> 반복문
		int i = 0;
		while(i<arr.length) {
			int plus_val = 2*i;
			arr[i] = Integer.toString(1+plus_val);
			System.out.println(arr[i]);
			i++;
		}
	}
	public void test12() {
		Dog[] arr = {new Dog(1),new Dog(2),new Dog(3)};
		
			Dog dog = arr[1];  
			
			Dog dog2 = arr[2];
			
			arr[0] = arr[1];
			
			//System.out.println(arr.length);
			
			for(int i =0; i <arr.length; i++) {
				 System.out.println(arr[i].getId());
			}
				
	}
	
	public void test13() {
		// 자료형이 Thread인 배열 arr를 생성하세요.
		Thread t1 = new Thread();
		Thread t2 = new Thread("2nd");
		Thread[] arr = {t1,t2};
		
		// arr에서 인덱스 0인 요소갓을 변수 thread의 초깃값으로 설정하세요.
		Thread thread = arr[0];
		thread = arr[1];
		
		//thread2에 arr의 인덱스가 2인 요솟값을 초깃값으로 설정하세요.
		Thread thread2 = arr[2];
		
		// arr의 크기를 구하는 코드를 작성하세요.
		int size = arr.length;
		
		
		// arr에 들어있는 모든 요솟값을 출력하세요.
		for(int i = 0; i <arr.length;i++){
			System.out.println(arr[i]);
			Thread t = arr[i];
			System.out.println(t);
		}
	}
	
}
