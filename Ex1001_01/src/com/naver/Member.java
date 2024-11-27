package com.naver;

public class Member {

	//toString 메서드까지 생성
	private String id;
	private String name;
	private int age;
	
	public Member() {}
	
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

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	// 배열 생성 공식1 
	// 자료형[] 배열명 = {값1, 값2}
	public void me1() {
		int[] arr = {11,13,17,19};
		
		int num = arr[0];
		num = arr[1];
		
		int num2 = arr[2];
		
		arr[0] =100;
		
		int size =arr.length;
		
		for(int i=0; i <arr.length; i++) {
			int n =arr[i];
			System.out.println(n);
		}
	}
	
	
	
	
	// 배열 생성공식2
	// 배열의 요솟값을 반복문을 이용해서 넣을
	// 자료형[] 배열명 = new 자료형[크기];
	// -> 배열에 값 넣기
	public void me2() {
		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		int num =arr[0];
		num =arr[1];
		int num2 =arr[2];
		
		arr[0] =100;
		
		int size = arr.length;
		
		
		for(int i =0; i <arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	public void me2_1() {
		// 배열에 "hello 0","hello2",...."hello100"가 
		// 들어 있는 배열 arr를 생성하세요.
		String[] arr = new String[51];
		//for문
		for(int j=0; j < 100; j++) {
			arr[j] = Integer.toString(j*2);
		}
		// while문
		int i = 0;
		while(i<51) {
			arr[i] = String.format("hello%d", i*2
					);
			System.out.println(arr[i]);
			i++;
		}
	}
	
	// 배열 생성 공식3
	// 자료형[] 배열명 = new 자료형[]{값1, 값2}
	public void me3() {
		
		int[] arr = new int[] {11,13,17,19};
		
		
		
	}
	
	
}
