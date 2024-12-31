package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "stress";
		char result = firstNonRepeatedChar(input);

		if (result != '\0') {
			System.out.println("First non-repeated character: " + result);
		} else {
			System.out.println("No non-repeated character found.");
		}
	}

	public static char firstNonRepeatedChar(String input) {
		// HashMap to store the frequency of each character
		Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

		// Iterate through the string and populate the frequency map
		for (char c : input.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		// Iterate through the map and return the first character with frequency 1
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey(); // Return the first non-repeated character
			}
		}

		// If no non-repeated character is found, return a default value
		return '\0'; // Return null character if none found
	}

}
