package Programs;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

