/*req. Output:
i1j1
i1j2
i1j3
i2j1
i2j2
i2j3
i3j1
i3j2
i3j3
 */
public class pattern14 {

	public static void main(String[] args) {
		int i = 1;

		while (i < 4) {
			int j = 1;
			while (j < 4) {
				System.out.println("i" + i + "j" + j);
				j++;
			}
			i++;
		}
	}
}