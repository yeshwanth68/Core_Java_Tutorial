package Encapsulation;

class Human1{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
		
	}
	public int setAge(int a) {
		return age=a;
	}
	
	public String getName() {
		return name;
		
	}
	public String setName(String a) {
		return name=a;
	}
	
}

public class Encapsulation1 {

	public static void main(String[] args) {
		
		Human1 h = new Human1();
		h.setAge(25);
		h.setName("Yeshwanth");
		System.out.println(h.getName()+" : "+ h.getAge());
		
		

	}

}
