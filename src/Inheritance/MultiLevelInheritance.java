package Inheritance;

class calc1{
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
}

class Advcal1 extends calc1{
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
}

class VeryAdvcal extends Advcal1{
	
	public double power(int a,int b) {
		return Math.pow(a, b);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Advcal1 obj = new Advcal1();
		int r1= obj.add(1, 2);
		int r2= obj.sub(2, 1);
		int r3= obj.mul(1, 2);
		int r4= obj.div(2, 1);
		int r5= obj.div(4, 2);
		
		System.out.println("r1= "+r1+" r2= "+r2+" r3= "+r3+" r4= "+r4+" r5= "+r5);

	}

}
