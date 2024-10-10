package DataTypes;

public class Dataypes {

	public static void main(String[] args) {
		//1. Primitive Data type - int, char, boolean, float, long, double, short
		//2. Non Primitive Data type - String, Array 
		
		int num =10;
		byte by = 127;
		float f= 4.6f;
		char c ='Y';
		boolean b = true;
		long l = 102102012l;
		short sh =34;
		double d =10.4;
		
		
		int num1 = 0b101;
		System.out.println(num1);
		
		int num2 = 0x7E;
		System.out.println(num2);
		
		int num3 = 10_00_000;
		System.out.println(num3);
		
		int num4 = (int) 12e10;
		System.out.println(num3);
		
		char ch = 'a';
		ch++;   //ch=ch+1
		System.out.println(ch);
		
		

	}

}
