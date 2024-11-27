package com.naver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	
	public void me9() {
		Date d = new Date(0L);
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//Date -> calendar 타입으로 변환
		cal.setTime(d);
		System.out.println(cal);
	}
	
	public void me8(String date){
		// 문자열로 된 날짜 정보를 Date 타입으로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(date);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void me7(){
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String naljja = sdf.format(d);
		System.out.println(naljja);
		
		 
	}
	
	public void me6() {
		
		// ,오늘로부터 123일은 며칠일까요?
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,23);
		System.out.println(cal);
		System.out.println(cal.getTime());
		
	}
	
	public void me5() {
		Calendar cal = Calendar.getInstance();
		int endDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(endDate);
	}
	
	public void me4() {
		// 추상클래스이기 때문에 new로 생성이 안됨.
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 10);
		// 0~11 => 0~1 ~ 11+1
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month);
	}
	
	public void me3() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		// 월 정보값은 0~11까지 있음.
		int month = cal.get(Calendar.MONTH)+1;
		
		// 날짜 정보 출력
		int date = cal.get(Calendar.DAY_OF_MONTH);
		// 요일정보
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
	}
	
	public void me2() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
	}
	
	public void me1() {
		// Calendar 클래스
		Calendar cal = Calendar.getInstance();
		
	}
}
