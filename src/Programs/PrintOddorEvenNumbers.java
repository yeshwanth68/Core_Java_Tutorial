package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class PrintOddorEvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number in a range");
		int num1 = sc.nextInt();
		System.out.println("Enter the Last Number in a range");
		int num2 = sc.nextInt();
		int count =0;
		
		for(int i=num1;i<=num2;i++) {
			count++;
		}
		int even[]= new int[count];
		int odd[] = new int [count];
		
		for(int i=num1;i<num2;i++) {
			if(i%2==0) {
				even[i]=i;
				System.out.println("even i"+i);
			}
			else {
				odd[i]=i;
				System.out.println("odd i"+i);
			}
		}
		System.out.println("Even Numbers are: "+Arrays.toString(even)); 
		System.out.println("Odd Numbers are: "+Arrays.toString(odd)); 
		

	}

}
