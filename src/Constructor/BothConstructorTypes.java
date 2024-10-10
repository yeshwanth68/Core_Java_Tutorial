package Constructor;

class Human1{
	private int age;
	private String name;
	
	public Human1() {
		age = 25;
		name="Yeshwanth";
	}
	
	public Human1(int age,String name) {
		this.age = age;
		this.name= name;
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
		this.name = name;
	}
}

public class BothConstructorTypes {

	public static void main(String[] args) {
		
		Human1 obj1 = new Human1();
		Human1 obj2 = new Human1(26,"Vishal");
		System.out.println(obj1.getName()+" : "+obj1.getAge());
		System.out.println(obj2.getName()+" : "+obj2.getAge());

	}

}
