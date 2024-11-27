package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정완료");
		
	}
	
	@Override
	public String toString() {
		return "수정";
	}

}
