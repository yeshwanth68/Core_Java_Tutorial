package AnonymousClass_and_Object;

class A{
	public A() {
		System.out.println("Object created");
	}
	
	public void show() {
		System.out.println("In A show");
	}
}

public class AnonymousObject {

	public static void main(String[] args) {
		
		new A().show();  // anonymous object
		new A().show();
		

	}

}
