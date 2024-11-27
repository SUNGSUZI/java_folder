package com.naver;

import java.util.Scanner;

public class SelectCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("전체조회 완료.");
		
	}

	@Override
	public String toString() {
		return "조회";
	}
}
