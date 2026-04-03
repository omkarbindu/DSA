

public class SecondLetter {
    public static void main(String[] args) {
        String word = "Hi"; // Given word

        // Check if the word has at least 2 letters
        if (word.length() >= 2) {
            System.out.println(word.charAt(1)); // Print 2nd letter (index 1)
        } else {
            System.out.println("Word is too short.");
        }
    }
}

