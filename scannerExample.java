import java.util.Scanner;

public class scannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Create a Scanner object
		System.out.println("Enter byte value");
		byte a = sc.nextByte();
		System.out.println("Enter short value");
		short b = sc.nextShort();
		System.out.println("Enter int value");
		int c = sc.nextInt();
		System.out.println("Enter long value");
		long d = sc.nextLong();
		System.out.println("Enter String value");
		String e = sc.next();
		System.out.println("Enter boolean value");
		boolean f = sc.nextBoolean();
		System.out.println("Enter float value");
		float g = sc.nextFloat();
		System.out.println("Enter char value");
		char h = sc.next().charAt(0);// reading char input from the user
		System.out.println("Enter String 1 value");
		String i = sc.nextLine();
		sc.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}

}
