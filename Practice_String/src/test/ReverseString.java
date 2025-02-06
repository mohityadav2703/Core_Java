// Write a program to reverse String

package test;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The String :");
		String str = sc.nextLine();

		String reverse = "";

		// First Way
		char[] chArr = str.toCharArray();
		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}
		System.out.println("");

		// Second Way
		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");

		// Third Way
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);

		// Fourth Way
		StringBuilder sbl = new StringBuilder(str);
		sbl.reverse();
		System.out.println(sbl);

		// fifth way
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		sc.close();
	}
}
