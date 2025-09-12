import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class sortVowelsInAString {
     public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        
        // Collect all vowels from the input string
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }

        // Sort the vowels lexicographically
        Collections.sort(vowels);

        // Rebuild the result string with sorted vowels in place of original vowels
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                result.append(vowels.get(index++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        sortVowelsInAString sol = new sortVowelsInAString();
        String input = "lEetcOde";
        String output = sol.sortVowels(input);
        System.out.println("Sorted vowels: " + output); // Output: "lEOtcede"
    }
}
