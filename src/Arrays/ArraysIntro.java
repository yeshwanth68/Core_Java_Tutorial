package Arrays;

import java.util.Arrays;

public class ArraysIntro {

	public static void main(String[] args) {
		
		int array1[] = {1,2,3,4,5};
		
		System.out.println(array1[0]);
		array1[1]=77;
		array1[2]=88;
		System.out.println(array1); // it will print the hash value
		System.out.println(Arrays.toString(array1)); // it will print the extact array
		
		// array length
		System.out.println("size="+array1.length);
		// printing array of each elements
		
		for(int i=0 ; i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		
		// default array value
		
		int row[];
		row = new int[5];
		
		System.out.println(Arrays.toString(row));  // [0, 0, 0, 0, 0]
		
		String st[];
		st = new String[5];
		
		System.out.println(Arrays.toString(st)); //[null, null, null, null, null]

		
		
		

	}

}
