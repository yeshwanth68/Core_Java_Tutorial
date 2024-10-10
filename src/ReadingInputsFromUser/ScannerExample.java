package ReadingInputsFromUser;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int num = sc.nextInt();
		sc.nextLine();  
		System.out.println("Number="+num);
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		System.out.println("Name="+name);
		
		 // Close the scanner
        sc.close();

	}

}
