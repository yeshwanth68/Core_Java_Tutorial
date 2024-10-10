package InnerClass;

class outerclass {

	private String name = "yeshwanth";

	class innerclass {

		void display() {
			System.out.println("Accessing: " + name);
		}
	}
	
	void createInner() {
		innerclass inner = new innerclass();
        inner.display();
    }

}

public class AnotherInnerClass {
	
	public static void main(String args[]) {
		
		outerclass oc = new outerclass();
		oc.createInner();
		
	}
}
