package ExceptionHandling;

public class ThrowExample {

	public static void validate(int age) {

		if (age > 18) {
			System.out.println("Able to vote..");
		} else {
			throw new ArithmeticException("Person is not eligible to vote");
		}
	}

	public static void main(String[] args) {

		validate(13);
		System.out.println("rest of the code...");

	}

}
