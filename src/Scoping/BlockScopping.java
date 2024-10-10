package Scoping;

public class BlockScopping {
	
	public void myMethod() {
        if (true) {
            int blockVariable = 40;  // Block scope
            System.out.println(blockVariable);  // Accessible within the if-block
        }
        // System.out.println(blockVariable);
    }

	public static void main(String[] args) {
		
		BlockScopping bs = new BlockScopping();
		bs.myMethod();

	}

}
