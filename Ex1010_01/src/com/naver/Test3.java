package com.naver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test3 {

	public void h1() {
		// index가 없음. key value형태
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		System.out.println(map.size());
		
		map.put(1,"kim");
		map.put(2, "kang");
		map.put(3, "ham");
		map.put(4, "ki");
		map.put(1, "lee");
		
		
		System.out.println(map.size());
		System.out.println(map);//키 1이 중복이 됨. kim이 아니라 lee가 들어가짐
		
		String val = map.get(1);// 인덱스가 아닌 key값을 넣음.
		
		List<Integer> key_list= map.keySet().stream().collect(Collectors.toList());
		key_list.forEach(n -> System.out.println(map.get(n)));
		
		
		Collection<String> values= map.values();
		System.out.println(values);
		List<String> list = new ArrayList<String>(values);
		System.out.println(list);
	}
	
	
	public void h2() {
		Map<String, String> map = new HashMap<String,String>();
	
		System.out.println(map.size());
		// 키 : 국가명, 값: 수도명
		// 4개 입력
		map.put("한국","서울");
		map.put("일본","도쿄");
		map.put("중국","베이징");
		map.put("베트남","하노이");
		
		
		
		/* 
		 * Set<String> set = map.keySet(); Iterator<String> it = set.iterator();
		 * while(it.hasNext()) { String key = it.next(); System.out.println(key); }
		 */
		// 위의 코드 요약
		// keylist
		// collect()는 Stream의 데이터를 변형 등의 처리를 하고 원하는 자료형으로 변환
		List<String> countryList = map.keySet().stream().collect(Collectors.toList());
		
		// valuelist
		List<String> capitalList = new ArrayList<String>();
		countryList.forEach(n-> capitalList.add(map.get(n)));
		capitalList.forEach(System.out::println);
		
		Collection<String> values = map.values();
		List<String> list = new ArrayList<String>(values);
		System.out.println("value 추출");
		list.forEach(System.out::println);
		
		// 키 벨류 추출
		map.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+ "::"+entry.getValue()));
		
	}
	
	public void h3() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		System.out.println(map.size());
		List<String> tvList = new ArrayList<String>();
		
		tvList.add("삼성tv");
		tvList.add("lg tv");
		
		List<String> refList = new ArrayList<String>();
		refList.add("삼성냉장고");
		refList.add("lg냉장고");
		
		map.put("tv", tvList);
		map.put("ref", refList);
		
		
		String nameOfTv = map.get("tv").get(0);
		System.out.println(nameOfTv);
		System.out.println("::::::::::::");
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			List<String> list =  map.get(key);
			for(String el: list) {
				System.out.println(el);
			}
			
		}
		
		
		/* 결과 
		::::::::::::
		삼성tv
		lg tv
		삼성냉장고
		lg냉장고
		 */
		
		
		
		
		
	}
}
