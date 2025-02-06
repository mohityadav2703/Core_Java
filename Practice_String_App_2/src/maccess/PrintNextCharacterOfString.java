/*
 * example :input  => ELEPHANT
 * 			output => FMFQIBOU
 */

package maccess;

public class PrintNextCharacterOfString {

	public static void main(String[] args) {
		String str = "Elephant".toUpperCase().trim();
		for(int i=0;i<str.length();i++) {
			int k=(int)str.charAt(i);
			if(k>=65 && k<=90) {
				System.out.print((char)(k+1));
			}
			
		}

	}

}
