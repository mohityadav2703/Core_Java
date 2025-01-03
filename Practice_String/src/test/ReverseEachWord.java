// Write a program to reverse each word of String

package test;
import java.util.Scanner;
public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine();
		
		// First Way
		String output="";
		String[] words=str.split(" ");
		for(String word : words) {
			String revWord="";
			//reverse Word
			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			output=output+revWord+" ";
		}
		System.out.println(output);
		
		// Second Way
		for(String word1 :words) {
			String revWord1="";
			StringBuffer sb=new StringBuffer(word1);
			sb.reverse();
			revWord1=revWord1+sb+" ";
			System.out.print(revWord1);
		}
		System.out.println("");
		// Third Way
		for(String word2 :words) {
			String revWord2="";
			StringBuilder sb1=new StringBuilder(word2);
			sb1.reverse();
			revWord2=revWord2+sb1+" ";
			
			System.out.print(revWord2);
		}
		sc.close();
	}
}
