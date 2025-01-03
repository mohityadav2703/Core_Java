package array;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {
	public static void main(String[] args) {
		int[] a = { 12, 6, 2, 1, 9, 8, 4, 7, 5, 13 };

//		FIRST WAY		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int k :a) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("Min Value :"+a[a.length-1]);
		System.out.println("Max Value :"+a[0] );
		
//		SECOND WAY		
//		Arrays.sort(a);
//		System.out.println("Min :"+a[0]);
//		System.out.println("Max :"+a[a.length-1]);
	}	
}
