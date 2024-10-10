package ExceptionHandling;

public class TryWithFinally {

	public static void main(String[] args) {
		
		int a =0;
		int b=10;
		try {
			
			int result = b/a;
			System.out.println("result="+result);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {   // this block will execute when the exception is caught or not
			System.out.println("This is finally block");
		}

	}

}
