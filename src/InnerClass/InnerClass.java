package InnerClass;


class A{
	public void show() {
		System.out.println("in show");
	}
	
	class B{
		
		public void config() {
			System.out.println("inside config");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.show();
		///obj.config(); here we can access directly the inner class
		
		A.B obj1 = obj.new B();  // A.B - B class is belongs to A class, obj.new B() - here already obj created for the main class so we can use the same.
		
		obj1.config();


	}

}
