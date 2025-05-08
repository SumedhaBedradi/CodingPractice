import java.util.Scanner;
public class MathematicOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation to perform: ");
		String operation = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();

		switch (operation) {
		case "Addition":
			MathOperation.additon(a, b);
			break;
		case "Subtraction":
			System.out.println("Subtraction: " + MathOperation.subtraction(a, b));
			break;
		case "Multiplication":
			MathOperation.multiplication(a, b);
			break;
		case "Division":
			System.out.println("Division: " + MathOperation.division(a, b));
			break;
		}
	}
}

class MathOperation {
	static void additon(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	static int subtraction(int a, int b) {
		return (a - b);
	}

	static void multiplication(int a, int b) {
		System.out.println("Multiplication: " + (a * b));
	}

	static int division(int a, int b) {
		return a / b;
	}
}

