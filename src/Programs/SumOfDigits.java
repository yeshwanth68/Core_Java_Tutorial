package Programs;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            System.out.println("sum->"+sum);
            num /= 10;
            System.out.println("num->"+num);
        }
        System.out.println("Sum of digits is " + sum);
    }
}

