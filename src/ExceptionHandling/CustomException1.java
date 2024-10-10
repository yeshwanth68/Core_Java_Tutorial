package ExceptionHandling;


class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}


class AgeValidator {
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 0 || age > 150) {
			throw new InvalidAgeException("Age must be between 0 and 150.");
		}
		System.out.println("Valid age: " + age);
	}
}


public class CustomException1 {
	public static void main(String[] args) {
		try {
			AgeValidator.validateAge(200); // This will throw the exception
		} catch (InvalidAgeException e) {
			System.err.println("Caught an exception: " + e.getMessage());
		}

		try {
			AgeValidator.validateAge(25); // This will be valid
		} catch (InvalidAgeException e) {
			System.err.println("Caught an exception: " + e.getMessage());
		}
	}
}
