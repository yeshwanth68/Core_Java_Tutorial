package Methods;

public class PassByValueExample {
	
	static void change(String naam){
		naam = "yeshwanth";
	}
	
	public static void modifyNumber(int num) {
        num = num + 10; // This modification only affects the local copy of 'num'
        System.out.println("Inside modifyNumber: " + num);
    }

	public static void main(String[] args) {
		
		String name = "Yesh";
		change(name);
		System.out.println(name);
		
		int number = 10;
        System.out.println("Before calling modifyNumber: " + number);
        
        modifyNumber(number);
        
        System.out.println("After calling modifyNumber: " + number);

	}
}
