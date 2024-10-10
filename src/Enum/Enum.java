package Enum;


enum status{
	
	Running, Failed, Success, SomethingWrong, Pending;
}

public class Enum {

	public static void main(String[] args) {
		
		status s = status.Failed;
		System.out.println(s);
		System.out.println(s.ordinal());  // position or order for the value
		
		status[] arr = status.values();
		
		for(status s1 : arr) {
			
			System.out.println(s1+" : "+s1.ordinal());
		}

	}

}
