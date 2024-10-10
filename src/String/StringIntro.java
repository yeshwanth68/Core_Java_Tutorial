package String;

public class StringIntro {

	public static void main(String[] args) {
		
		String str1 = "Hello, World!";
		
		String str2 = new String("Hello, World!");
		
		
		//1.Concatination
		String firstName = "Yeshwanth";
		String lastName = "Kumar";
		String fullName = firstName + " " + lastName;  
		System.out.println(fullName);

		// Using concat()
		String greeting = "Hello".concat(", ").concat("World!");
		System.out.println(greeting);  // Output: Hello, World!

		//2.Length
		String text = "Hello";
		int length = text.length();
		System.out.println(length);
		
		//3.Accessing character
		String text1 = "Java";
		char letter = text1.charAt(0); 
		System.out.println(letter);
		
		//4.Substring
		String text2 = "Hello, World!";
		String sub = text2.substring(7, 12);  
		System.out.println(sub);
		
		//5.String Comparison
		//5.1 equals()
		String s1 = "Java";
		String s2 = "Java";
		boolean isEqual = s1.equals(s2);  
		System.out.println(isEqual);
		
		//5.2
		String s3 = "Apple";
		String s4 = "Banana";
		int result = s3.compareTo(s4);  
		System.out.println(result);
		
		//6.Case coversion
		String cs = "Java Programming";
		System.out.println(cs.toLowerCase());  
		System.out.println(cs.toUpperCase());
		
		//7.Trim whitespace
		String white = "   Hello, World!   ";
		System.out.println(white.trim());
		
		//8.Replace
		String rp = "Java is fun";
		String newText = rp.replace("fun", "powerful");
		System.out.println(newText);
		
		//9.Spillting string
		String sentence = "Java is awesome";
		String[] words = sentence.split(" ");  // Split by space
		for (String word : words) {
		    System.out.println(word);
		}
		
		//10.string property
		String sp = "Learning Java";
		System.out.println(sp.startsWith("Learning"));  // Output: true
		System.out.println(sp.endsWith("Java"));  // Output: true
		System.out.println(sp.contains("Java"));
	}
	

}
