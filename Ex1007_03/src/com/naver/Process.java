package com.naver;

import java.util.Scanner;

public class Process {
	
	public void start() {
		boolean isTrue = true;
		Scanner sc = new Scanner(System.in);
		Command[] arr = {
						 new InsertCommand(), 
						 new SelectCommand(),
						 new UpdateCommand(),
						 new DeleteCommand()
						 };
		
		Command menu = null;
		while(isTrue) {
			System.out.println("메뉴를 선택하세요.");
			
//			for(Command x :arr) {
//				
//				System.out.println(x);
//			}
			
			for(int i=0; i<arr.length;i++) {
				Command x = arr[i];
				System.out.println(i+" : "+x);
			}
			
			System.out.println(arr.length+" : 종료");
			
			int idx = sc.nextInt();
			sc.nextLine();
			if(idx != arr.length) {
				menu = arr[idx];
				menu.execute(sc);
			}else {
				isTrue = false;
			}
		}
		
		sc.close();
	}
}
