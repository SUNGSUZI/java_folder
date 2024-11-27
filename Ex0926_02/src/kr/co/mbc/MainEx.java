package kr.co.mbc;


import com.samsung.Cat;
import com.samsung.Dog;
import com.samsung.Member;

public class MainEx {

	public static void main(String[] args) {
		
		// Dog 클래스를 이용해서 jindo라는 인스턴스 생성
		// 사용자 생성자 이용하세요.
		// 필요한 데이터는 알아서
		
		Dog jindo = new Dog(001, "쪼끼");
		
		//jindo가 갖고 있는 test1메서드 호출
		// 필요한 값은 알아서
		jindo.test1(6);
		

		
		Cat cat = new Cat("m1", "jerry", null, jindo);
		cat.test13("hello","hello");
		cat.test13("hello",
				new String("hello"));
		int reuslut = cat.test12(10, 4);
		System.out.println(reuslut);
		
		
		Member m = new Member();
		m.test21(50);
		System.out.println(m.test22(1));
		
		Member kim = new Member("m12", "김유신",19,null, cat, new Cat("m1", "jerry", null, jindo));
		String kim_dog_name = kim.getDog().getName();
		
		
	
	}
	

}

