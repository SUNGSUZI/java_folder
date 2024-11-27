package kr.co.lg;

import java.util.Date;

public class Sonata extends Car{
	private int id;

	public Sonata(int id) {
		super();
		this.id = id;
	}

	public Sonata() {
		super();
		// TODO Auto-generated constructor stub
	}

	// super VS super()
	// super 자식 클래스에서 부모 클래스의 인스턴스를 호출할때 사용함.
	// 자식 클래스의 멤버변수명과 부모 클래스의 멤버면수명이 같을때,
	// 자식 클래스의 멤버변수가 우선적을 지정이됨
	// 이때 부모클래스의 멤버변수를 가리키고 싶다면 super.를 붙여서 호출하면 됨.
	public Sonata(int id, String name, Date birth) {
		super(id, name, birth);
		this.id =id;
		super.setId(3);
		System.out.println(super.getId());
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
