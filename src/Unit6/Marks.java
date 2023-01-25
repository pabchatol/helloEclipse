package Unit6;

public class Marks {
	private String name;
	private int age;
	private int m1;
	private int m2;
	private int m3;
	
	public Marks () {
		
	}
	public Marks (String name, int age, int m1, int m2, int m3) {
		this.name=name;
		this.age= age;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}
	public int getM3() {
		return m3;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age + ", mark 1=" + m1 + ", mark 2=" + m2 + ", mark 3=" + m3;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	
	
	

}
