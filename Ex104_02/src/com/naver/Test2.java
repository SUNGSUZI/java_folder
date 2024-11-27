package com.naver;


public class Test2 {
	private static Test2 test2 = null;
	
	private Test2() {}
	
	public static Test2 getInstance() {
		if(Test2.test2 == null) {
			Test2.test2 = new Test2();
			return Test2.test2;	
		}		
		
		return Test2.test2;
		
		
		
	}
}
