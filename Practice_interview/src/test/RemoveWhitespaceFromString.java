package test;
import java.util.Scanner;

public class RemoveWhitespaceFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ");
		String str = sc.nextLine();
		int count=0;
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
		
		for(int i=0;i<str.length();i++) {
			int k=(int) str.charAt(i);
			if(k==32) {
				count++;
			}
		}
		System.out.println("Total Spaces in this String :"+count);
		
		
	}
}
