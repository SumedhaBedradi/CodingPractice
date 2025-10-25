import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Top element: " + minStack.top()); // 2
        System.out.println("Current min: " + minStack.getMin()); // 2

        minStack.pop(); // removes 2
        System.out.println("After popping 2:");
        System.out.println("Top element: " + minStack.top()); // 7
        System.out.println("Current min: " + minStack.getMin()); // 3

        minStack.pop(); // removes 7
        minStack.pop(); // removes 3
        System.out.println("After popping more elements:");
        System.out.println("Top element: " + minStack.top()); // 5
        System.out.println("Current min: " + minStack.getMin()); // 5
    }
}
