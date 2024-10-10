package PolyMorphism;

class Helper{
	static int multiply(int a, int b) {
		return a*b;
	}
	
	static double multiply (double a, double b) {
		return a*b;
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		
		
		System.out.println(Helper.multiply(10,2));
		System.out.println(Helper.multiply(5.5,6.3));
		

	}

}
