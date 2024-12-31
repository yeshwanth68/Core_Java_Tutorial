package Programs;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 56, 78, 90, 23, 56};  // Example array
        System.out.println("Second highest number is: " + findSecondHighest(numbers));
    }

    public static int findSecondHighest(int[] numbers) {
        // Edge case: If the array has less than 2 elements, there is no second highest
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements.");
        }

        int highest = Integer.MIN_VALUE;  // Initially the lowest possible value
        System.out.println("highest->"+highest);
        int secondHighest = Integer.MIN_VALUE;  // Initially the lowest possible value
        System.out.println("secondHighest->"+secondHighest);
        // Traverse through the array
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;  // Update second highest before highest
                highest = num;  // Update highest
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;  // Update second highest
            }
        }

        // Return the second highest value
        return secondHighest;
    }
}

