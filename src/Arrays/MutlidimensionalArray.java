package Arrays;

import java.util.Arrays;

public class MutlidimensionalArray {

	public static void main(String[] args) {
		
		int num[][] = new int[3][4];
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(num[i][j]+" ");  // here multiplication takes place
			}
			System.out.println();
		}
		
		
		int nums[][] = new int[3][4];
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				nums[i][j] = (int)(Math.random()*100);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Iterating each values using enhanced for loop..");
		
		for(int n[]:nums) {
			for (int m:n) {
				System.out.println(m+" ");
			}
		}

	}

}
