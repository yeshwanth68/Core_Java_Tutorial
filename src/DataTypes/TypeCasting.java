package DataTypes;

public class TypeCasting {

	public static void main(String[] args) {
		// Type Casting - converting of one data types to another data type in both ways mannually or automatically.
		// 1. Widening - lower to higher
		// 2. Narrowing - higher to lower
		
		
		//1. Widening - automatically converting 
		int x = 7; 
		long y = x;  
		float z = y;  
		System.out.println("Before conversion, int value "+x);  
		System.out.println("After conversion, long value "+y);  
		System.out.println("After conversion, float value "+z);  
		
		
		//2. Narrowing - explicit conversion
		
		double d = 166.66;  
		long l = (long)d;  
		int i = (int)l;  
		System.out.println("Before conversion: "+d);  
		System.out.println("After conversion into long type: "+l);  
		System.out.println("After conversion into int type: "+i); 
		
		
		
		byte a=10;  
		byte b=10;  
		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
		byte c=(byte)(a+b);  
		System.out.println(c);  
		

	}

}
