/*
 * count the total number of vowel, consonants, numbers and spaces
 */

package string;

import java.util.Scanner;

public class CountVowelConsoSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine().toLowerCase();
		int vowel = 0, conso = 0, spaces = 0, number = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int k=(int)ch;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			}
			else if(k>=48 && k<=57) {
				number++;
			}
			else if(k==32) {
				spaces++;
			}
		}
		conso=str.length() - (vowel+number+spaces);
		System.out.println("Number of Vowels Vowels Are : "+vowel);
		System.out.println("Total Numbers Are :"+number);
		System.out.println("Total Spaces Are :"+spaces);
		System.out.println("Total Consonants Are :"+conso);
	}
}
