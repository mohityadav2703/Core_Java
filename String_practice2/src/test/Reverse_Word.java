package test;
import java.util.Scanner;

public class Reverse_Word {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=s.nextLine();
		
		String[] word=str.split(" ");
		String reverString="";
		 for(String w:word) {
			 String reverseWord="";
			 for(int i=w.length()-1; i>=0;i--) {
				 reverseWord=reverseWord+w.charAt(i);
			 }
			 reverString=reverString+reverseWord+" ";
		 }
		 System.out.println(reverString);
		
	}
}
