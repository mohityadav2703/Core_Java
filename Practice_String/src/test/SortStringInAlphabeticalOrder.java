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
		//FIRST WAY(WITHOUT SORT())
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	//	System.out.println(new String(arr));
		System.out.println(arr);
		
		//SECOND WAY(WITH SORT())
		Arrays.sort(arr);
		System.out.println(new String(arr));
		System.out.println(arr);
		
		sc.close();
	}
}
