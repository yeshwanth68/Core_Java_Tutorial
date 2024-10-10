package PolyMorphism;

class Help{
	static int add(int a,int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		
		System.out.println(Help.add(10,2));
		System.out.println(Help.add(10,2,3));

	}

}
