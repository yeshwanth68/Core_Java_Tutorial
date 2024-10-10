package Constructor;

public class SimpleConstructor {
	int roll;
	String className;

	SimpleConstructor() {   // constructor
		System.out.println("Body of default constructor");
	}

	public static void main(String[] args) {

		System.out.println("Object is going to create");
		SimpleConstructor s1 = new SimpleConstructor();  // this also constructor

	}

}
