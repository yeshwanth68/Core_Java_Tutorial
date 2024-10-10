package Methods;

class Method{
	
	public int add (int a, int b)
	{
		return a+b;
	}
	
	public int add (int a, int b,int c)
	{
		return a+b+c;
	}
	
	public double add (double a, double b)
	{
		return a+b;
	}
		
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Method mo = new Method();
		System.out.println(mo.add(12,12));
		System.out.println(mo.add(12,12,12));
		System.out.println(mo.add(12.2,12.2));

	}

}
