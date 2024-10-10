package Interface;

interface A1{
	
	void show();
	
	String name = "Yeshwanth";
	int age = 25;
	
}

class B1 implements A1{
	
	public void show() {
		System.out.println("in show");
	}
	
	public void config() {
		System.out.println("in config");
	}
}

public class InterfacewithVariables {

	public static void main(String[] args) {
		
		B1 obj = new B1();
		
		obj.show();
		obj.config();
		
		System.out.println("Name="+A1.name);  // we can access the variable using interface name because all variables in interface are static and final
		System.out.println("Age="+A1.age);

		//A1.age = 26;  //The final field A1.age cannot be assigned static variable can't be changed or updated
	}

}
