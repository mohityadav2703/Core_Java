//Find the minimum and maximum value from array

package test;

import java.util.Arrays;

public class FindMinAndMaxValue {
	public static void main(String[] args) {
		int a[]= {1,423,6,46,34,23,13,53,4};
		
		Arrays.sort(a);
		
		System.out.println("Minimun Value :"+a[0]+"\nMaximum Value :"+a[a.length-1]);
		
	}

}
