// print string in alphabetical order

package test;
import java.util.Arrays;
import java.util.Scanner;

public class SortStringInAlphabeticalOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine();
		//1st way
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(char c : ch) {
			System.out.print(c);
		}
		System.out.println();
		//2nd way
		Arrays.sort(ch);
		System.out.println(ch);
	}
}
