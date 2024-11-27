package kr.co.lg;

import java.util.Date;

public class S502 {
	private int id;
	private String name;
	private Date birth;
	
	
	public S502() {}


	public S502(int id, String name, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}


	@Override
	public String toString() {
		return "K7 [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}
	
	
	
}
