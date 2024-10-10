package ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		int a = 0;
		int b = 10;

		int sums[] = new int[5];

		try {
			int result = b / a;
			System.out.println(result);

			System.out.println(sums[6]);
		}

		catch (ArithmeticException e) {

			System.out.println("ArithmeticException" + e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException" + e);
		}

		catch (Exception e) {
			System.out.println("Inside final exception");
			e.printStackTrace();
		}

	}

}
