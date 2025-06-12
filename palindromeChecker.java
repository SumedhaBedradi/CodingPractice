// Java Program to Check if a 
// String is a Palindrome
import java.util.Scanner;
public class palindromeChecker
{

    public static boolean isPalindrome(String s) {
      
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String ");
        String s = sc.next();

        // Check if the string is a palindrome
        boolean res = isPalindrome(s);

        // Print the result with enhanced output
        if (res) {
            System.out.println('"' + s + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + s + '"' + " is not a palindrome.");
        }
        }
    }