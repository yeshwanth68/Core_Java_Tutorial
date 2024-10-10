package Inheritance;

class calculator{
	public int add (int a,int b) {
		return a+b;
	}
}

class Advcalculator extends calculator{
	public int add(int a, int b){
		return a+b+1;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Advcalculator obj = new Advcalculator();
		int r = obj.add(2, 3);
		System.out.println("r== "+r);
		

	}

}
