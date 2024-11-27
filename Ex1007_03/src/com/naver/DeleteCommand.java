package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제완료");
	}

	@Override
	public String toString() {
		return "삭제";
	}
}
