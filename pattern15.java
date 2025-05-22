
/* 
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
public class pattern15 {
    public static void main(String[] args) {
		int i = 1;
		while (i <= 3) {
			int j = 1;
			while (j <= 4) {
				if (j == 3 || i == 2) {
					j++;
					continue;
				}
				System.out.println("i" + i + "j" + j);
				j++;
			}
			i++;
		}
	}
}
    
