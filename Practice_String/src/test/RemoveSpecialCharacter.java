//write a program to remove special character from string

package test;
import java.util.Scanner;
public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine();
		
		//first way
		String str1= str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);
		sc.close();
	}
}
