package Exceptions_and_Errors;

public class ErrorExample {
    public static void main(String[] args) {
        try {
            // This will likely throw OutOfMemoryError if the JVM runs out of memory
            String[] strings = new String[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Caught an OutOfMemoryError: " + e.getMessage());
        }
    }
}
