import java.util.Scanner;

public class factorialOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int N = sc.nextInt();
		System.out.println("Enter M value");
		int M = sc.nextInt();
		int fact1 = 1;
		int i = 1;
		do {
			fact1 *= i;
			i++;
		} while (i <= N);
		System.out.println("Factorial of " + N + " is " + fact1);

		int fact2 = 1;
		int j = M;
		do {
			fact2 *= j;
			j--;

		} while (j >= 1);
		System.out.println("Favtorial of " + M + " is " + fact2);
	}

}
 
