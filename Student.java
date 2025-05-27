public class Student {
	int rollno;
	String name;
	int marks;

	 void study() {
		System.out.println("Studying");
	}

	 void practice() {
		System.out.println("Practicing");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollno = 13;
		s1.name = "Sumedha";
		s1.marks = 89;
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		s1.study();
		s1.practice();
	}
}