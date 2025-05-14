    
/**
**
***
****
*****
*****
****
***
**
*

*/
public class pattern7 {

	public static void main(String[] args) {
		// Upper half
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Lower half
		for (int k = 6; k >= 1; k--) {
			for (int l = 1; l < k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
