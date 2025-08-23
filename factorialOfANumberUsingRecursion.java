import java.util.Scanner;
class factorialOfANumberusingRecursion {
public static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        
        // Calculate the factorial
        long result = factorial(num);
        
        // Display the result
        System.out.println("Factorial of " + num + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}