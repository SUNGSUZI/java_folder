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
	
	// 변수가 생성되는 시점에 따른 변수 분류
	// 인스턴스 Vs 클래스 변수
	// 변수 선언위치에 따른 변수 분류
	// 멤버변수 vs 매개변수 vs 로컬변수
	public void me1(int num) {
		int result =10;
		// 멤버변수 : id,name,price
		// 매개변수 :num
		// 지역변수 : result -> 선언된 곳의 {(본문시작)과 짝이 맞는 }(끝)까지
		 
		if(result ==10) {
			int test = 100;
			System.out.println(test);
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
//		System.out.println(test); if안에서 선언된 로컬변수라 안됨.
//		System.out.println(i); for문 안에서 선언된 로컬 변수라 안됨.
	}
	
	
	// 소수구하기
	public void me2(int num) {
		boolean isSosu = true;
		if(num >2) {// Math.sqrt는 매개변수의 절반까지만 구하는 함수
			for(int i=2; i< Math.sqrt(num) ; i++) {
				if(num %i ==0) {
					isSosu = false;
					 break;
				}
			}
		}else{
			if(num !=2) {
				isSosu =false;
				
			}
		}
		
		if(isSosu==true) {
			System.out.println( num + "은 소수입니다.");
		}
		System.out.println("end");
		
	}
	
	// 피보나치
	public void me3(int end) {
		
		int pre_pre = 1;
		int pre = 1;
		
		for(int i =0;i<7; i++) {
			int current = pre_pre+ pre;
			pre_pre = pre;
			pre = current;
			System.out.println(current);
		}
		
		
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
		return "Item [id="+id+",name="+name+"]";
	}
	
}
