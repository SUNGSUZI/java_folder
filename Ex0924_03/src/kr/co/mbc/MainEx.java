package kr.co.mbc;

import com.samsung.Member;

public class MainEx {

	public static void main(String[] args) {
		Member kim = new Member("m001","홍길동",16);
		String info = kim.getDeungbonInfoBySsn("9999");
		System.out.println(info);
	}
}
