package test;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceCharacterWithItsOccurance {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine();
		System.out.println("Enter the character to check :");
		char ch=sc.next().charAt(0);
		
		if(str.indexOf(ch)==-1) {
			System.out.println("Given Character is not Available in Given String :");
			System.exit(0);
		}
		char[] arr=str.toCharArray();
		int cnt=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ch) {
				arr[i]=String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
