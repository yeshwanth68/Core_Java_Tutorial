package FinalKeyword;

public class FinalParameters {
	public void printValue(final int number) {
		// number = 10; // This would cause a compilation error
		System.out.println("Number: " + number);
	}

	public static void main(String[] args) {
		FinalParameters example = new FinalParameters();
		example.printValue(5);
	}

}
