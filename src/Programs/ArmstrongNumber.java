package Programs;

public class ArmstrongNumber {
    public static void main(String[] args) {
    	int num = 153, number, temp, total = 0;   //153 = 1 + 125 + 27

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            System.out.println("temp->"+temp);
            total = total + temp*temp*temp;
            System.out.println("total->"+total);
            number /= 10;
            System.out.println("number->"+number);
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

