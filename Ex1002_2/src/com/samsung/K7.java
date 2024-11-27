package com.samsung;

import java.util.Date;

public class K7 extends Car{
	private int price;

	public K7() {
		super();
		// TODO Auto-generated constructor stub
	}

	public K7(int id, String name, Date birth, int price) {
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
