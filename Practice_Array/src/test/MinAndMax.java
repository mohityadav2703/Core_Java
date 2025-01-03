//Program to find the minimum (or maximum) element of an array

package test;

import java.util.Arrays;

public class MinAndMax {
	public static void main(String[] args) {
		int[] a = { 2, 6, 3, 9, 5, 7, 23 };
		
		// 1st way
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int ab : a) {
			System.out.print(ab + " ");
		}
		System.out.println("\nMax Element :" + a[0]);
		System.out.println("Min Element :" + a[a.length - 1]);

		// 2nd way
		Arrays.sort(a);
		for (int ab : a) {
			System.out.print(ab + " ");
		}
		System.out.println("\nMax Element :" + a[a.length - 1]);
		System.out.println("Min Element :" + a[0]);

	}

}
