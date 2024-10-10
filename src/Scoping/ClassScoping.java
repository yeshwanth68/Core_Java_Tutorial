package Scoping;

public class ClassScoping {

	static int classVariable = 10;  // Class scope

    public static void main(String[] args) {
        System.out.println(classVariable);  // Accessible throughout the class
    }

}
