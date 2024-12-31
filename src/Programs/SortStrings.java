package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStrings {
	
	public static void main(String[] args) {
        // List of month names with mixed case
        List<String> months = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "aug", "Sep", "Oct", "nov", "Dec");
        
        // Sort the list using Collections.sort with a case-insensitive comparator
        Collections.sort(months, String.CASE_INSENSITIVE_ORDER);
        
        // Output the sorted list
        System.out.println("Sorted list of months: " + months);
    }

}
