package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number in a range");
        int num1 = sc.nextInt();
        System.out.println("Enter the Last Number in a range");
        int num2 = sc.nextInt();

        int evenCount = 0, oddCount = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        evenCount = 0;
        oddCount = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                even[evenCount++] = i;
            } else {
                odd[oddCount++] = i;
            }
        }

        System.out.println("Even Numbers are: " + Arrays.toString(even));
        System.out.println("Odd Numbers are: " + Arrays.toString(odd));
    }

}
