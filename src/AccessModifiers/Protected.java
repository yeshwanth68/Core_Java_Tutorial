package AccessModifiers;

class ProtectedExample {
	protected String familySecret = "I am protected";

	protected void showSecret() {
		System.out.println(familySecret);
	}
}

public class Protected {

	public static void main(String[] args) {
		ProtectedExample obj = new ProtectedExample();
		obj.showSecret(); // Accessible within the same package

	}

}
