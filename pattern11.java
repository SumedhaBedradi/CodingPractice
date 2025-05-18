public class pattern11 {
    public static void drawPatternM(int size) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((j == 1 || j == 5) || (i == 2 && j == 2) || (j == 3 && i == 3) || (j == 4 && i == 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int size = 5;
		drawPatternM(size);
	}
}

   