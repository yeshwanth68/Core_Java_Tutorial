package AccessModifiers;

class DefaultExample {
	String message = "I am default (package-private)";

	void showMessage() {
		System.out.println(message);
	}
}

public class Default {

	public static void main(String[] args) {
		DefaultExample obj = new DefaultExample();
        obj.showMessage();  // Accessible within the same package

	}

}
