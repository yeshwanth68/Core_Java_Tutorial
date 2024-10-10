package Inheritance;

class calc{
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
}

class Advcal extends calc{
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
}

public class InheritanceIntro {

	public static void main(String[] args) {
		
		Advcal obj = new Advcal();
		int r1= obj.add(1, 2);
		int r2= obj.sub(2, 1);
		int r3= obj.mul(1, 2);
		int r4= obj.div(2, 1);
		
		System.out.println("r1= "+r1+" r2= "+r2+" r3= "+r3+" r4= "+r4);
		
		
		

	}

}
