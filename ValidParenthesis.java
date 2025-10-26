import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();

        String test1 = "()";
        String test2 = "([{}])";
        String test3 = "(]";

        System.out.println(vp.isValid(test1)); // true
        System.out.println(vp.isValid(test2)); // true
        System.out.println(vp.isValid(test3)); // false
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
