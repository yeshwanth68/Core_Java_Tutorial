package Programs;

public class SwapNumbers {
	
	static void swap (int a, int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After A="+a+" B="+b);
		
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before A="+a+" B="+b);
		swap(a,b);
		

	}

}
