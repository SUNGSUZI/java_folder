package com.naver;

public class Item {

	
	private int id;
	private String name;
	private int price;
	
	
	public Item() {
		super();
	}
	public Item(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	// 다차원 배열
	// n차원 배열 안에는 n-1차원 배열이 들어 있음.
	public void test1() {
		int[] arr1 = new int[3]; //arr1은 1차원배열
		
		int[][] arr2 = new int[3][5]; // arr2는 2차원배열
		
		
		// int[행][열] arr2 = new int[3][5]
		// int[] -> T로 치환
		// T[] arr2 = new T[2]
		// N차원 배열 안에는 N-1차원 배열이 있음
		
	}
	
	public void test2() {
		/* 
		 [오류발생]
		   Why?. 2차원 배열 선언시 1차원 배열의 개수를 지정하지 않으면 오류발생.
		   int[][] arr= new int[][];
		 
		 */
		int[][] arr= new int[5][];// -> 1차원 배열에는 n개가 들어가고 그러한 1차원이 5개 있음.
		
		
		/*
		 * arr2는 몇 차원 배열? 
		 * 3차원배열 arr2에는 몇 차원 배열이 들어 있습니까? 2차원배열 
		 * arr2의 2차원 배열에는 몇개 들어있습니까? 1개 
		 * arr2의 2차원 배열에는 몇 차원 배열이 들어 있습니까? 1차원배열 
		 * arr2의 2차원 배열에 들어 있는 1차원 배열은 몇개 있습니까? 3개
		 
		 */
		int[][][] arr2 = new int[1][3][2];
		
	}
	
	
	public void test2_1() {
		int[] arr10 = {1,3,5,7};
		int[] arr11 = {0,2,4,6};
		int[] arr12 = {1,2,3,4};
		
		int[][] arr = {arr10,arr11,arr12};
		
		System.out.println(arr.length);
		
		int[] arr_0 = arr[0];
		int[] arr_1 = arr[1];
		System.out.println(arr_0);
		
//		for(int i =0; i< arr.length;i++) {
//			System.out.println("::::::::::::"+i+"번째 배열");
//			for(int j=0; j < arr[i].length; j++) {
//				int ele = arr[i][j];
//				System.out.println(ele);
//			}
//		}
		
		for(int i =0; i < arr.length; i++) {
			getElement(arr[i]);
		}
		
	}
	
	public void getElement(int[] arr) {
		for(int i =0; i< arr.length; i++) {
			int n = arr[i];
			System.out.println(n);
		}
	}
	
	
}
