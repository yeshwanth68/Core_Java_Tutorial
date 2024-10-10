package ExceptionHandling;

import java.util.Arrays;

public class Exception2 {

	public static void main(String[] args) {
		
		int nums[] = new int [5];
		
		System.out.println("Nums"+Arrays.toString(nums));
		
		try {
			
			System.out.println(nums[6]);
		}
		catch(Exception e) {
			
			System.out.println("Something went wrong "+e);
		}



	}

}
