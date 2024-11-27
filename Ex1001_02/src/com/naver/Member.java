package com.naver;

import java.util.StringTokenizer;

public class Member {

	private String id;
	private String name;
	private int age;
	
	
	public Member() {
	}
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	public void test1() {
		// String 클래스의 명시적 객체 생성법
		String msg = new String("hello");
		
		// String 클래스의 암시적 객체 생성법
		String str = "hello";
		
		// 동일성 비교 : == 연산자를 이용.. 정말로 같은 것인지 확인
		System.out.println(msg == str);
		
		//동등성 비교 : 특정 조건에 대해 같은 값을 갖고 있는지 물어봄. equals 메서드를 이용함.
		System.out.println(msg.equals(str));
	}
	
	public void test2() {
		String str1=  "hello";
		String str2 = "hello";
		String msg1 = new String("hello");
		String msg2 = new String("hello");
		
		// ==은 값이 아닌 주소를 비교하는것이다.
		System.out.println(str1 == str2);
		System.out.println(msg1.equals(msg2));
	}
	
	
	// [첨조]https://deveric.tistory.com/123
	public void test3() {
		//믄지열의 불변적 성격
		// heap(명시적 객체생성)이 constant(암시적 객체생성)영역보다 메모리가 크다.
		// 프로그램이 덜 빨리 죽음.
		String msg = new String("h");
		msg = msg +"e"; 
		// 기존의 h가 저장되었던 장소에 e를 추가하여 저장되는것이 아닌, he라는 문자열을 heap의 새로운 메모리주소에 저장하는것.
		// 그럼 기존의 h의 인스턴스는 가만히 놔둬지느냐? 프로그램 돌아가는 생명주기에 맞춰 사라지지만 시간이 걸림.
	}
	
	// String 클래스의 불변적 성격을 보완하는
	// StringBuffer 클래스
	// 문자열이 추가되는 상황일때 사용.
	// String을 사용하면 메모리 부족이 생기기 때문에
	// StringBuffer클래스를 이용해서 메모리 절약
	// 만약 String 변수에 완전히 다른값을 넣을때는 ㄴ
	// 그냥 String 클래스를 이용하면 됨.
	//  스레드동기화를 제공하는것은 StringBuffer이다.
	public void test31() {
		StringBuffer sb = new StringBuffer();
		sb.append("h");
		sb.append("e");
		sb.append("l");
		sb.append("l");
		sb.append("o");
		// String Buffer를 사용하여 인스턴스는 하나만 사용된것.
	
		String msg = sb.toString();
		// 보통은 String 자료형을 많이 쓰기에 StringBuffer를 사용한 후 String으로 변환해주는 작업을 한다.
		
		String h = "h";
		h = h +"l";
		// 이런식으로 추가할때는 StringBuffer의 사용을 권장.
	
		String e = "e";
		e = "l";
		// 이런식으로 값이 아예 바뀌는 것은 String클래스를 사용권장.
	}
	
	
	// 주요메서드 학습
	public void test4() {
		String msg = "    hello world    ";
		char c = msg.charAt(0);
		char c1 = "C".charAt(0); 
		// 문자열이 하나인 경우 char 자료형으로 변경하는법
		
		int size = msg.length(); // 문자열의 길이 반환
		System.out.println(c); // 빈칸 출력
		System.out.println(size); // 공백을 포함한크기, 19
		
		
		// trim을 사용해서 좌우 공백을 없앰.
		System.out.println("before>>>"+ msg);
		msg = msg.trim();
		System.out.println("after>>>"+ msg);
		/* [결과]
		 * before>>> hello world 
		 * after>>>hello world
		 */
		
		
		// strip을 통해서도 공백을 지울 수 있음.
		msg = msg.strip();
		System.out.println("strip after>>>"+ msg);
		
		// 문자열 잘라내기 : 문자열 슬라이싱
		// 현재 msg = "hello world"
		// hello만 가져오기
		// substring을 사용하려면 인덱스를 알아야한다.
		String str = msg.substring(6); // 입력한 인덱스부터 마지막까지
		System.out.println(str);
		str = msg.substring(0, 5); //인덱스 0~5까지
		System.out.println(str);
		
		str = msg.substring(2,7);
		System.out.println(str);
		
		// 문자열의 특정 문자 또는 단어에 대한 인덱스 찾기
		// 현재 msg = "hello world";
		int idxStart = msg.indexOf("l");
		System.out.println(idxStart);
		
		// 현재 msg에는 l이 두개 있다 
		// 두번쨰 l의 인덱스 값을 구하고 싶으면 어떻게 해야하는가?
		// indexOf("찾을 문자", 탐색을 시작할 인덱스)
		// 첫번째 l의 인덱스 이후부터 다음 l을 찾아야하기에
		// +1을 해줌.
		int idxSecond = msg.indexOf("l",idxStart+1);
		System.out.println(idxSecond);
		
		// 마지막 인덱스부터 l을 찾음. 역방향
		int idxLast = msg.lastIndexOf('l');
		System.out.println(idxLast);
		
		int idxW = msg.indexOf("w");
		System.out.println(idxW);
		
		msg="super.png";
		boolean result = msg.endsWith(".png");
		if(msg.endsWith(".png")) {
			System.out.println("png 이미지 파일 맞음");
		}
		
		msg = "20240901";
		result = msg.startsWith("202409");
		if(msg.endsWith(".202409")) {
			System.out.println("2024년 9월 파일입니다.");
		}
		
		msg = "게시판에 올라가는 글입니다. 욕설을 사용하면 안됩니다.";
		result = msg.contains("욕설");
		System.out.println(result);
		
		//문자열의 영문자를 소문자, 대문자로변경
		msg = "kim gu";
		msg.toUpperCase();
		msg.toLowerCase();				
		
		
		msg = "m001#kimgu#100#서울#s1";
		String[] arr = msg.split("#");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		
		
		
	}
	
	
	// 문자열의 split()메서드를 보완하는 StringTokenizer클래스
	public void test5() {
		String data = "m001#kimgu#100##서울";
		String[] arr = data.split("#");
		System.out.println(arr.length);
	
		//##은 생량함
		StringTokenizer st = new StringTokenizer(data,"#");
		System.out.println(st.countTokens());
		String[] arr2 = new String[st.countTokens()];
		
		int i =0;
		while(st.hasMoreTokens()) {// 토근이 더 있는가?
			
			String token = st.nextToken();
			arr2[i] = token;
			System.out.println(arr2[i]);
			++i;
		}
	}
	
	
	
	
}
