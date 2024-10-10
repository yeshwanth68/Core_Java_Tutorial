package Constructor;

class Human{
	
	private int age;
	private String name;
	
	public Human() {
		System.out.println("Constructor");
		age =12;
		name="yeshwanth";
	}
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
		this.name=name;
	}
}

public class Constructor1 {

	public static void main(String[] args) {
		
		Human h = new Human();
		Human h1 = new Human();
		
		System.out.println(h.getName()+" : "+h.getAge());

	}

}
