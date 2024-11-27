package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Array;

public class Test01 {
	
	public void me1() {
		// 추상 클래스
		InputStream in = null;
		// byte stream의 out stream 에서 가장 최상위 클래스
		OutputStream ou = null;
		try {
			// os에 따라 "\\"와 "//"인지 다르다. 
			//그렇기에 file.separator를 사용하여 구분자를 java에서 사용자의 os에 맞게 지정하도록 함.
			in = new FileInputStream("C:"+File.separator+"test01.jpg");
			// outputstream은 파일이 없으면 자동으로 생성.
			ou = new FileOutputStream("C:"+File.separator+"test_copy.jpg");
			
			int what = 0;
			while(true) {
				// 데이터가 없으면 -1반환한다.
				what = in.read();
				
				if(what == -1){
					break;
				}
				ou.write(what);
			}
			
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(in !=null) {
				try {
						in.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(ou !=null) {
				try {
						ou.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	public void me1_2() {
		
		InputStream in =null;
		OutputStream out = null;
		
		
		try {
			String filePath = "C:"+File.separator+"test01.jpg";
			String copyPath = "C:"+File.separator+"test_copy2.jpg";
			in = new FileInputStream(filePath);
			out = new FileOutputStream(copyPath);
			
			
			int what = 0;
			while((what = in.read()) != -1) {
				out.write(what);
			}
			System.out.println("복사완료.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void me2() {
		InputStream in = null;
		OutputStream out = null;
		
		long start = System.nanoTime();
		try {
			
			String filePath = "C:"+File.separator+"test01.jpg";
			String copyPath = "C:"+File.separator+"test_copy3.jpg";
			in = new FileInputStream(filePath);
			out = new FileOutputStream(copyPath);
			
			
			byte[] arr = new byte[1024];
			
			while(true) {
				
				
				int length = in.read(arr);
				
				if(length == -1) {
					break;
				}
				out.write(arr,0,length);
				
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			long end = System.nanoTime();
			System.out.println(end-start);
		}
	}
	
	public void me3() {
		InputStream in = null;
		BufferedInputStream bis = null;
		
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		
		try {
			
			// buffer 임시로 데이터를 담아 둘 수 있는 일종을 큐.
			// stream은 즉시 전송하게 디바이스에 전송하게 되는데 
			// 이것은 디스크 접근이나 네트워크 접근같은 오버헤드가 발생하기 때문에 매우 비효율적임
			// buffer는 중간에서 입력을 모아서 한번에 출력함으로써 i/o의 성능을 향상시키는 역할을 함.
			String filePath = "C:"+File.separator+"test01.jpg";
			in = new FileInputStream(filePath);
			bis = new BufferedInputStream(in);
			
			String copyPath = "C:"+File.separator+"test_copy4.jpg";
			out = new FileOutputStream(copyPath);
			bos = new BufferedOutputStream(out);
			
			int what = 0;
			while(true) {
				what = bis.read();
				
				if(what == -1) {
					break;
				}
				bos.write(what);
			}
			
			System.out.println("필터스트림으로 파일 복사 완료.");
		}catch(Exception e) {
			
		}finally {
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(in !=null) {
				try {
					in.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(out !=null) {
				try {
					in.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			if(bos !=null) {
				try {
					in.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
		}
	}
	
	
	
	public void me4() {
		// 전송속도에 따른 분류
		// 바이트 스트림, 문자 스트림
		Writer out = null;
		String[] arr ={"hello","world","good","morning"};
		
		try {
			String path = "C:"+File.separator+"tt.txt";
			out = new FileWriter(path);
			for(int i =0; i<arr.length;i++) {
				String msg = arr[i];
				out.write(msg);
				out.write(System.getProperty("line.separator"));// System.getProperty("line.separator") : 줄바꿈
			}
			
			
			out.flush(); // 문자 스트림에서는 필수 작업.
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(out!=null) {
				try {
					out.close();
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
	
	public void me5() {
		// 문자스트림 Reader를 이용해서 c://tt.txt파일의 내용을 읽어와서
		// 출력하세요.
		Reader in = null;
		
		try {
			String path  = "C:"+File.separator+"tt.txt";
			
			in = new FileReader(path);
			int what = 0;
		
			while(true) {
				what = in.read();
				if(what==-1) {
					break;
					
				}
				
				System.out.print((char)what);
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	public void me5_2() {
		Reader in = null;
		
		try {
			String path = "C:"+File.separator+"tt.txt";
			in = new FileReader(path);
			
			char[] arr =new char[8];
			
			while(true) {
				int length = in.read(arr);
				if(length == -1) {
					break;
				}
				System.out.println("::::::::::::******:::::::::");
				System.out.println(arr); // 줄 바꿈은 2글자로 인식
//				String msg = new String(arr);
//				msg = msg.substring(0,length);
//				System.out.println(msg);
				
				
//				for(int i=0; i< length; i++) {
//					System.out.print(arr[i]);
//				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in != null) {
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
