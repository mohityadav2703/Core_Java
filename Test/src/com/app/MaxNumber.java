package com.app;

public class MaxNumber {

	public static void main(String[] args) {

		int[] a = { 25, 14, 56, 36 };
		int el = 25;
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] != el) {
				b[i] = a[i];
			}else {
				b[i]=a[i];
			}

		}

		
			for(int k:b) {
				System.out.print(k+" ");
			}
	}

}
