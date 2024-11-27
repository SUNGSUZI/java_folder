package com.naver;

public class Dog {
	private int id;
	private String name;
	
	public Dog() {}
	
	public Dog(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 가변형 배열
	// 배열공식 2번에서
	// 다차원 배열에서 n-1차원 배열의 크기는 반드시 입력해야 함.
	// 그 외 n-2차원 배열의 크기 등은 비워 둘 수 있음.
	// n-2차원의 크기가 다를때
	public void k1() {
		int[][] arr= new int[3][];
		arr[0] = new int[]{1,2,3,4,5};
		arr[1] = new int[] {0,2,4,6,8,10,12};
		
		int[] arr_2 = new int[4];
		
		for(int i =0; i<arr_2.length;i++) {
			arr_2[i] = i *3;
			
		}
		
		Item[][][] arr2 = new Item[2][][];
	}
	
	
	// vargs : variable arguments의 약자
	// -> 파이썬에서 함수 중에서 인수를 수 없이 넣을 수 있었던 함수
	// 당시 매개변수 앞에 *을 붙혔었음.
	// 자바는 자료형 뒤에 ...(점3개)를 찍어서 구현함.
	public void k2(int... arr) {
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			System.out.println(num);
		}
	}
	
	//vargs를 이용해 메서드 생성시 유의 사항.
	// vargs 변수는 마지막에 넣어야한다.
	// why? vargs의 변수는 몇개까지 변수로 받을지 모르기 때문에
	public void k3(String c, char ...arr) {
		
	}
	
	
}
