package com.samsung;

import java.util.Date;

public class MainEx {

	public static void main(String[] args) {
		Car car1 = new K7(1,"car1",new Date(),100);
		K7 k1 = null;
		if(car1.getClass() == K7.class) {
			k1 = (K7)car1;
			int price = k1.getPrice();
			System.out.println(price);
			
		}
	}
}
