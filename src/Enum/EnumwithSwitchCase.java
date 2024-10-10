package Enum;

enum statusmessage{
	
	Failed, Success, Error, Pending;
}

public class EnumwithSwitchCase {

	public static void main(String[] args) {
		
		statusmessage sm = statusmessage.Failed;
		
		switch(sm) {
			case Failed:
				System.out.println("Failed Message");
				break;
				
			case Success:
				System.out.println("Success Message");
				break;
			
			case Error:
				System.out.println("Error Message");
				break;
				
			default:
				System.out.println("No Message found.....");
				break;
		}

	}

}
