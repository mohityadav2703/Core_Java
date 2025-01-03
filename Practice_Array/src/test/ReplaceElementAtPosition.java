package test;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementAtPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index position you want to add new Element");
		int index =sc.nextInt();
		System.out.println("Enter the new Element ");
		int ele=sc.nextInt();
		arr[index]=ele;
		
		System.out.println(Arrays.toString(arr));	
		sc.close();
	}
}
