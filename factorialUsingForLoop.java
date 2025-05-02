import java.util.Scanner;
public class factorialUsingForLoop {
    public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = 1;
		for (int i = n; i >= 1; i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}

