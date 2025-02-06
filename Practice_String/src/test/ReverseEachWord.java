// Write a program to reverse each word of String

package test;
import java.util.Scanner;
public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine();
		String revWord="";
		
		// this is mohit kumar
		String []words = str.split(" ");
		for(String word : words) {
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			revWord=revWord+sb+" ";
		}
		System.out.println(revWord);
		
	}
}
