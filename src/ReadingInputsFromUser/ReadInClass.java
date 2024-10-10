package ReadingInputsFromUser;

import java.io.IOException;

public class ReadInClass {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a no: ");
		
		int num = System.in.read();   //it will  show the ascii value
		
		System.out.println(num);
		

	}

}
