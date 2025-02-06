/**
 * 		*****
 * 		 ****
 * 		  ***
 * 		   **
 * 			*
 */

package practice_pattern;

public class Print_Triangle_2 {

	public static void main(String[] args) {
		int star=5;
		for(int i=1;i<=star;i++) {
			for(int j=star;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=i;k<=star;k++) {
				if(k==i) {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
