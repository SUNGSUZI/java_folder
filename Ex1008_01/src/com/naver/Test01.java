package com.naver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01 {
	
	// 예외 처리란? 
	// 예외가 발생하면, 예외에 대한 코드를 별도로 작성해서 프로그램이 끝까지 정상적으로 실행되게 하기
	public void me1(int a) {
		try {
			System.out.println(4/a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("여기까지 실행이 돼야 하는데");
	}
	
	public void me2(String msg, int idx) {
		 
		try {
			String str = msg.substring(5);
			System.out.println(1111);
			str = "he";
			str.charAt(idx);
			System.out.println(2222);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// try catch문 이후에 실행이 됨.
		// 반드시 실행 되어야 하는 코드가 뒤에 있는 경우는 try catch
		// 위의 내용이 최종적으로 사용되는것.
		System.out.println("무조건 실행되어야함.");
		
	}
	
	public void me3() throws Exception{// catch에 뭘 넣어야 할지 모를때 throws 사용, 부품으로 사용할때 
		System.out.println(4/0);
		// 예외가 발생할때 실행되지 않아됨. 그럼 throws
		System.out.println("예외가 발생하면 실행되지 않음");
	}
	
	// 도덕적인 문제로 강제로 예외를 발생한 상황
	public void me4(String msg) throws Exception{
		msg = "hellos dog";
		msg.length();
		if(msg.contains("dog")) {
			throw new Exception("욕하시면 안됩니다.");
			// throw를 통해 예외를 발생시킨것
		}
		System.out.println(msg);
	}
	
	// 논리적으로 맞지 않아 강제로 예외를 발생시킨 상황
	public void me4_1(int choice){
		int[] arr= {1,2,3,4};
		
		System.out.println("0~2까지만 선택하세요.");
		if(choice >= 3 || choice < 1) {
			throw new RuntimeException("0~2까지만 선택하세요.");
		}
		
		System.out.println(arr[choice]); 
	}
	
	public void me6(int a) {
		try {
			System.out.println(4/a);
			
			if(a==4) {
				return;
				// return 때문에 밑에 내용 실행이 되지 않음
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("예외 여부와 관계없이");
			System.out.println("무조건 실행해야하는 코드");
		}
		
	}
	
	
	// finally구문에 있는 코드는 return문보다 우선순위가 있음.
	public void me6_1() {
		InputStream in = null;
		// "isr" + ctrl + shift 자동완성
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			/*
			 * if(in != null) { 
			 * 	try { 
			 * 		in.close(); 
			 * } catch (IOException e) { // TODO
			 * 		e.printStackTrace(); 
			 * 		} 
			 *}
			 * 
			 * if(isr != null) { 
			 * 	try { isr.close(); 
			 * } catch (IOException e) { // TODO
			 * 	e.printStackTrace(); 
			 * 	} 
			 * }
			 */
			try {
				if(in != null) {
					in.close();
				}
				if(isr != null) {
					isr.close();
				}
				if(br != null) {
					br.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
}
