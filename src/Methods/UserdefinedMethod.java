package Methods;

class Definedmethods{
	
	public int add() {
		System.out.println("Addition method without parameter...");
		return 0;
	}
	
	public int add(int a,int b) {
		int result = a+b;
		return result;
	}
	
	public String stringmethod() {
		return "This is string method";
	}
}

public class UserdefinedMethod {

	public static void main(String[] args) {
		
		Definedmethods us = new Definedmethods();
		
		us.add();
		System.out.println(us.add(10,10));
		System.out.println(us.stringmethod());
		

	}

}
