package test;

import java.util.Arrays;

public class SmallestAndLargestElement {

	public static void main(String[] args) {
	
		int[] a= {3,1,5,2,9,6,8,4};
		
		// 1st Way
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.print("Sorted Arrays : ");
		for(int no :a) {
			System.out.print(no+" ");
		}
		System.out.println("\nSmallest Number is :"+a[0]);
		System.out.println("Largest Number is :"+a[a.length-1]);
		
		// 2nd Way
		
		Arrays.sort(a);
		System.out.println("Smallest Number is :"+a[0] +"\nLargest Number is :"+a[a.length-1]);
	}
}
