package com.samsung;

import java.util.Date;

public class Sonata extends Car{
	
	private int price;

	
	public Sonata() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Sonata(int id, String name, Date birth, int price) {
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
