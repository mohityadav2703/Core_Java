package test;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementAtPosition {
	public static void main(String[] args) {
		int index=3;
		int ele=6;
		int []arr= {3,1,2,8,9,1,2,6,7};
		arr[index]=ele;
		
		for(Integer k : arr) {
			System.out.print(k+" ");
		}
		
	}
}
