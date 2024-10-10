package Encapsulation;

class Human{
	
	private int age =25;
	private String name="Yeshwanth";
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Human obj = new Human();
		//obj.name="Yesh";  - here we can't change because of the private variables
		//obj.age=24;
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		

	}

}
