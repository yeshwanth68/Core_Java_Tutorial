package Programs;

import java.util.Scanner;

public class OddorEvenNumbers {
	
	public static void oddorevent(int number) {
		
		if(number%2==0) {
			System.out.println("The number is Even....");
		}
		else {
			System.out.println("The number is odd");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		oddorevent(num);
	}

}
