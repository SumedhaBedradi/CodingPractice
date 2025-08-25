import java.util.Scanner;

class factorialWithDoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
} 
  
