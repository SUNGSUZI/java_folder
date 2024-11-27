package co.kr.mbc;

import com.naver.Member;

public class MainEx {

	public static void main(String[] args) {
		Member kim = new Member("k1", null,11);
		//m.test12();
		//m.test11();
		kim.test12();
		
		String id =  kim.getId();
		// kim이 갖고 있는 아이디의 첫글자를 가져오세요.
		char c = id.charAt(0);
		//kim.test13();
		
		String data = "m001#1234lvel5#5";
//		String[] arr = data.split("#"); 
		// #문자를 기준으로 문자열을 잘라 배열로 반환
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		int[] arr = {1,1,2,3,5,8,13,21,34};
		int num1 = arr[0];
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
