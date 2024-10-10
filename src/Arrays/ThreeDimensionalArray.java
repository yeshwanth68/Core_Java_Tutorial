package Arrays;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		
		int[][][] threeDArray = {
	            { {1, 2, 3}, {4, 5, 6} },
	            { {7, 8, 9}, {10, 11, 12} }
	        };
		for (int i = 0; i < threeDArray.length; i++) {  // Loop through the first dimension
            for (int j = 0; j < threeDArray[i].length; j++) {  // Loop through the second dimension
                for (int k = 0; k < threeDArray[i][j].length; k++) {  // Loop through the third dimension
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();  // Move to the next line after each 2D block
            }
            System.out.println();  // Blank line between layers of the 3D array
        }

	}

}
