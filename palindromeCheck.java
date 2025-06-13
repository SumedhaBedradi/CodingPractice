import java.util.Scanner;
public class palindromeCheck {
    static String isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString()) ? s + " is Palindrome" : s + " is not a Palindrome";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }
}
