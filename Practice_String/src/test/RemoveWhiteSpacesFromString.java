// write a program to remove all white spaces from given string

package test;
import java.util.Scanner;

public class RemoveWhiteSpacesFromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine();
		
		String abc=str.replaceAll("\\s", "");
		System.out.println(abc);
		sc.close();
	}
}
