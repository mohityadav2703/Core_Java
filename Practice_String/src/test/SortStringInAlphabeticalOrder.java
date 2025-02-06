//write a program to sort string in alpabetical order

package test;
import java.util.Arrays;
import java.util.Scanner;

public class SortStringInAlphabeticalOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine();
		char temp;
		
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}
}
