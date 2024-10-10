package Encapsulation;

class Human3{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationPerfect {

	public static void main(String[] args) {
		Human3 h = new Human3();
		h.setAge(25);
		h.setName("Yeshwanth");
		System.out.println(h.getName()+" : "+ h.getAge());

	}

}
