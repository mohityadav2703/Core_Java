// Remove all the Special characters from string

package test;
import java.util.Scanner;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		String str1=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str1);
	}
	
}
