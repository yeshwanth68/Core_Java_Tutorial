package Programs;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
        
        int arr1[] = {10, 20, 30, 40, 50};

        int n=arr1.length;
        System.out.println("n->"+n);
        for(int i=n-1; i>=0; i--)
          System.out.print(arr1[i]+" ");
    }
}

