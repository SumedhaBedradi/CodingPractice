import java.util.Scanner;

public class swapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a = sc.nextInt();
		System.out.println("Enter value for b: ");
		int b = sc.nextInt();

		System.out.println("a is " + a + " and b is " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping, a is " + a + " and b is " + b);
	}

}
