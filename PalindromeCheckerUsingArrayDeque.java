import java.util.*;

public class PalindromeCheckerUsingArrayDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine().toLowerCase();
        ArrayDeque<Character> ad = new ArrayDeque<>();
        for (char c : word.toCharArray()) {
            ad.addLast(c);
        }
        boolean isPalindrome = true;
        while (ad.size() > 1) {
            if (!ad.removeFirst().equals(ad.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(word + (isPalindrome ? " is Palindrome" : " is not a palindrome"));
        sc.close();
    }
}