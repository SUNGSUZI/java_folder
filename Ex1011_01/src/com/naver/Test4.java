package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class Test4 {
	// File 클래스 학습
	// File = 파일 + 디렉토리
	// File클래스는 파일과 디렉토리를 관리하기 위해서 만들어졌음.
	// 디렉토리 생성과 삭제
	// 파일은 삭제만 생성은 지원하지 않음.
	
	// File 객체를 생성함
	public void me7() {
		File f1 = new File("C:"+File.separator+"AAA");
		
		// 삭제
		// f1.delete()
		if(f1.exists()) {
			System.out.println("이미존재합니다.");
		}
		boolean result = f1.mkdir();
		System.out.println(result);
	}
	
	public void me8() {
		File f1 = new File("C:"+File.separator+"test_copy2.jpg");
		
		// 삭제
		if(f1.exists()) {
			f1.delete();
		}
	}
	
	public void me8_1() {
		File f1 = new File("C:"+File.separator+"test_copy.jpg");
		
		// 삭제
		if(f1.exists()) {
			f1.delete();
		}
	}
	
	public void me9() {
		File f1 = new File("C:"+File.separator+"AAA");
		File newFilename = new File("C:"+File.separator+"BBB");
		
		
		// 이름 바꾸기
		f1.renameTo(newFilename);
	}
	
	
	
	public void me1() {
		InputStream in = null;
		OutputStream out = null;
		
		// filter stream 
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		
		try {
			String filePath = "C:"+File.separator+"test01.jpg";
			String copyPath = "C:"+File.separator+"test_copy2.jpg";
			
			in = new FileInputStream(filePath);
			out = new FileOutputStream(copyPath);
			
			bis = new BufferedInputStream(in);
			bos = new BufferedOutputStream(out);
		
			
			int what = 0;
			
			while(true) {
				if(what == -1) {
					
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

		
	}
	
	
	public void me2() {
		
		
		Reader re= null;
		BufferedReader bre = null;
		
		try {
			re = new FileReader("C:"+File.separator+"tt.txt");
			bre = new BufferedReader(re);
			
			while(true) {
				if(bre.readLine()==null) {
					break;
				}
			}
			System.out.println(bre.readLine());
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(bre!=null) {
				try {
					bre.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(re!=null) {
				try {
					re.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	public void me9_1(){
		File ccc = new File("C:"+File.separator+"CCC");
		ccc.mkdir();
	}
	
	public void me10() {
		File f1 = new File("C:"+File.separator+"CCC");
		
		f1.delete();
	}
	
	
	
	
}
