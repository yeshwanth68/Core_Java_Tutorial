package ExceptionHandling;

class YeshException extends Exception{
	
	public YeshException(String string) {
		super(string);
	}
}

public class CustomException {

	public static void main(String[] args) {
		
		int i=0;
		int j=10;
		
		try{
			j = 18/i;
			if(j==0)
				throw new YeshException("I don't");
		}
		catch(YeshException e) {
			
			j=18/1;
			System.out.println("Thats default.."+e);
			
		}
		
		

	}

}
