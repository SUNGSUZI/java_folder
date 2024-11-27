package com.naver;

public class YourThread extends Thread{

	
	public Sum sum;
	public int start;
	public int end;
	
	public YourThread() {
		super();
	}

	public YourThread(Sum sum, int start, int end) {
		super();
		this.sum = sum;
		this.start = start;
		this.end = end;
	}



	@Override
	public void run() {
		for(int i = start; i<= end; i++) {
			///System.out.println("i의 값 : "+Thread.currentThread().getName()+  + i);
			
			sum.plusNum(i);
			System.out.println("1>>>>"+Thread.currentThread().getName()+sum.num);

			
			//sum.minusNum2(i);
			System.out.println("::::::::::::::::::::");
			
			//sum.minusNum3(i);
		}
	}
}
