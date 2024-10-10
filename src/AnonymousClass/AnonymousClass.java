package AnonymousClass;

class A{
	public void show() {
		
		System.out.println("In show method..");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		A obj = new A() {   // anonymous class
			
			public void config() {
				System.out.println("Inside anonymous class....");
			}
			
		};
		
		obj.show();
	}

}
