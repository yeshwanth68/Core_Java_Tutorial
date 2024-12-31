package Programs;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "programming";
        char ch = 'g';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Character " + ch + " occurs " + count + " times.");
    }
}

