//print each word of string in reverse

package test;
import java.util.Scanner;

public class ReverseEachWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ");
		String str = sc.nextLine(); // hello this is java
		
		//first way
		String output="";
		String[] words=str.split(" ");
		for(String word : words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			output=output+revWord+" ";
		}
		System.out.println(output);
		
		//Second Way
		for(String word1 : words) {
			String revWord1="";
			StringBuffer sb = new StringBuffer(word1);
			sb.reverse();
			revWord1=revWord1+sb+" ";
			System.out.print(revWord1);
		}
		System.out.println();
		
		for(String word2 : words) {
			String revWord2="";
			StringBuilder sb = new StringBuilder(word2);
			sb.reverse();
			revWord2=revWord2+sb+" ";
			System.out.print(revWord2);
		}
	}

}
