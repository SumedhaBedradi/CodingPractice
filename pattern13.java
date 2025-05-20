
/*output:
i1j1
i1j2
i1j4
i3j1
i3j2
i3j4
 */
public class pattern13 {

	public static void main(String[] args) {
		int i = 1;
		do {
			int j = 1;
			do {
				if (j == 3 || i == 2) {
					j++;
					continue;

				}
				System.out.println("i" + i + "j" + j);
				j++;
			} while (j <= 4);
			i++;
		} while (i <= 3);
	}

}
    
