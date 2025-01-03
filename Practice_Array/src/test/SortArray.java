package test;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int a[]= {13,3,1,9,11,4,6,10,8,2};
		System.out.print("Original Array :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println("");
		System.out.print("After Sorting :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
