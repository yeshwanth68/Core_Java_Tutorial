package Scoping;

public class InstanceScoping {
	
	 int instanceVariable = 20;  // Instance scope

    public void display() {
    	System.out.println(instanceVariable);  // Accessible throughout the class instance
	}

	public static void main(String[] args) {
		
		InstanceScoping is = new InstanceScoping();
		is.display();
	}

}
