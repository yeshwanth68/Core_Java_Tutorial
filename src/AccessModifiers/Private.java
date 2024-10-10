package AccessModifiers;

class PrivateExample {
	private String secret = "I am private";

	private void displaySecret() {
		System.out.println(secret);
	}

	public void accessSecret() {
		displaySecret(); // Private method accessed within the class
	}
}

public class Private {

	public static void main(String[] args) {
		PrivateExample obj = new PrivateExample();
		// obj.displaySecret(); // Error: Cannot access private method from outside
		obj.accessSecret(); // Works: Indirect access through public method

	}

}
