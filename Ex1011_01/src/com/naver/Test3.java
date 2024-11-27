package com.naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test3 {
	public void me6() {
		
		// 보통은 byte스트림을 많이 지원한다.
		// 만일 문자스트림을 byte스트림으로 변경해야한다면. 채
		Reader in = null;
		BufferedReader br = null;
		
		
		
		try {
			String path = "C:" + File.separator+"tt.txt";
			
			in = new FileReader(path);
			br = new BufferedReader(in);
			
			String msg = null;
			
			while(true) {
				msg = br.readLine();
				if(msg == null) {
					break;
				}
				
				System.out.println(msg);
			}
		} catch (Exception e) {
			
		}finally {
			
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(br != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
