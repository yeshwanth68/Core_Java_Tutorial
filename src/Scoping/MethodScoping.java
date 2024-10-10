package Scoping;

public class MethodScoping {
	
	public void myMethod() {
        int methodVariable = 30;  // Method scope
        System.out.println(methodVariable);  // Accessible only within the method
    }

	public static void main(String[] args) {
		
		MethodScoping ms = new MethodScoping();
		ms.myMethod();
		

	}

}
