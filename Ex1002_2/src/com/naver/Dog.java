package com.naver;

import java.util.Date;

public class Dog extends Animals{
	
	private int price;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(int id, String name, Date birth, int price) {
		super(id, name, birth);
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
