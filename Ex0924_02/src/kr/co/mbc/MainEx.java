package kr.co.mbc;




import com.samsung.Turtle;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turtle t1 = new Turtle();
		
		t1.setAge(20);
		int age = t1.getAge();
		
		System.out.println(age);
		
		
		Turtle t2 = new Turtle(20, "거북" ,'b');
		
		
		
		age = t2.getAge();
		System.out.println(age);
		
		String name=  t2.getName();
		System.out.println(name);
		
		char color = t2.getColor();
		System.out.println(color);
		
	
	}

}
