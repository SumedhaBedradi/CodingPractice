import java.util.ArrayDeque;
import java.util.Scanner;

public class ParanthesisCheckerUsingArrayDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String exp = sc.nextLine();
        if (isBalanced(exp)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
        sc.close();
    }

    public static boolean isBalanced(String exp) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : exp.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
