package Scoping;

public class LoopScoping {
	
	public void myMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);  // Loop scope
        }
        // i is not accessible here
    }

	public static void main(String[] args) {
		LoopScoping ls = new LoopScoping();
		ls.myMethod();
		

	}

}
