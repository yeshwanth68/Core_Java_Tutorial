package Encapsulation;

class Human2{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age,Human2 h) {
		Human2 h2 = h;
		h2.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name,Human2 h) {
		Human2 h2 = h;
		h2.name=name;
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		
		Human2 h = new Human2();
		h.setAge(25,h);
		h.setName("Yeshwanth",h);
		System.out.println(h.getName()+" : "+ h.getAge());
		

	}

}
