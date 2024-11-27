package kr.com.mbc;

import com.samsung.Dog;

public class MainEx {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		// boolean을 제외한 기본자료형의 default값은 수치형이다.
		System.out.println(d1.b1);
		System.out.println(d1.c1);
		System.out.println(d1.by1);
		System.out.println(d1.s1);
		System.out.println(d1.i1);
		System.out.println(d1.l1);
		System.out.println(d1.f1);
		System.out.println(d1.d1);
		
		/*
		 참조자료형의 default값은 null이다.
		 null은 값이 아니다.
		 상태를 의미한다. 
		 메모리를 할당되지 않아 값이 없는 상태.
		 */
		System.out.println(d1.msg);
		System.out.println(d1.cat);
		// char는 수치형 자료형이다
		
		System.out.println(d1.c1 == (char)0);
		
		/*
		접근제어지시자 종류 및 스코프 
		public :프로젝트 전체에서 인식됨
		protected : 같은 패키지, 
				      다른 패키지일때, 
				      상속되지 않은 클래스 인식안됨 
			          상속된 클래스 인식 됨
		default: 같은 패키지에서만 인식 됨. 아무것도 안적으면 default
		private : 같은 클래스에서만 인식이되고 다른 클래스나 같은 패키지, 다른 패키지에서 인식 안됨.
		 사용가능한 접근제어지시자
		 클래스 : public 과 디폴트만 사용가능
		 변수/ 메소드/ 사웃
		 */
		

		
		
	}
}
