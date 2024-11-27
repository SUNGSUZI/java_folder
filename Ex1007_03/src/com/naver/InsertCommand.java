package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("입력완료");
		
	}

	@Override
	public String toString() {
		return "임력";
	}
	

}
