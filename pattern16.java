/* 
  req. ouput:
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

 */

public class pattern16 {

	public static void main(String[] args) {
		int n = 5;

		// Upper half
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Print stars with spaces
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Lower half
		for (int i = n - 1; i > 0; i--) {
			// Print spaces
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Print stars with spaces
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
