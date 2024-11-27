package kr.co.mbc;

import com.naver.Member;

import kr.co.lg.Sonata;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member kim = new Member("m1","김",19);
		Member lee = new Member("m1","이", 29);
		
		System.out.println(kim==lee);
		System.out.println(kim.equals(lee)); // 아이디만 같아도 같다고 나오게 equals메서드를 오버 라이딩 했기에 true가 나옴.
		
		
		System.out.println(":::::::::"
				+ "");
		Sonata sonata = new Sonata(1,"소",null);
		int idSonata = sonata.getId();
		System.out.println(idSonata);
	}

}
