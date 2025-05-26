 class Program {
 static int x, y;
	static {
		System.out.println("Static Block");
		x = 10;
		y = 20;

	}

	static void display1() {
		System.out.println("Static Method");
		System.out.println(x);
		System.out.println(y);
	}

	int a, b;
	{
		System.out.println("Non-Static Block");
		a = 111;
		b = 222;
		x = 333;
		y = 444;
	}

	void display2() {
		System.out.println("Non-Static Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}

public class staticKeyword {

	public static void main(String[] args) {
		Program.display1();
		Program pr = new Program();
		pr.display2();
	}

}
