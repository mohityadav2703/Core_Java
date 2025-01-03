package test;

import java.util.Arrays;

public class SecondLagestElement {

	public static void main(String[] args) {
		int []a= {7,1,5,3,9,11,6,8,2};
		Arrays.sort(a);
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Lagest Element is         :"+a[len-1]);
		System.out.println("Second Largest Element is : "+a[len-2]);
		System.out.println("Third Largest Element is  : "+a[len-3]);
		System.out.println("Fourth Largest Element is : "+a[len-4]);
		System.out.println("Fifth Largest Element is  : "+a[len-5]);
		System.out.println("Sixth Largest Element is  : "+a[len-6]);
		System.out.println("Seventh Largest Element is: "+a[len-7]);
	}
}
