public class Calculator {

	public static void main(String[] args) {
		add();// Type 1
		int x = 10, y = 5;
		subtract(x, y); // Type 2
		int multRes = multiply();
		System.out.println("Multiplication:" + multRes);// Type 3
		int divideRes = divide(x, y);
		System.out.println("Division:" + divideRes);// Type 4

	}

	// Type I --> No parameters & no return type
	static void add() {
		int a = 10;
		int b = 5;
		int res1 = a + b;
		System.out.println("Addition:" + res1);
	}

	// Type II --> parameters & no return type
	static void subtract(int a, int b) {
		int res2 = a - b;
		System.out.println("Subtraction:" + res2);
	}

	// Type III --> No parameters & return type
	static int multiply() {
		int a = 10;
		int b = 5;
		int res3 = a * b;
		return res3;
	}

	// Type 4 --> parameters & return Type
	static int divide(int p, int q) {
		int res4 = p / q;
		return res4;

	}

}
