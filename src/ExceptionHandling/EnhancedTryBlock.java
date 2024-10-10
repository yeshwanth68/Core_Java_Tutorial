package ExceptionHandling;

import java.util.Scanner;

public class EnhancedTryBlock {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your age: ");
			int age = sc.nextInt();

			// Consume the leftover newline character
			sc.nextLine();

			System.out.print("Enter your name: ");
			String name = sc.nextLine();

			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}

	}

}
