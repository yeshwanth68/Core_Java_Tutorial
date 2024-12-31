package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		System.out.println(numbers);

		List<Integer> sortedNumbers = 
				numbers.stream().
				sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted List in Descending Order: " + sortedNumbers);

	}

}
