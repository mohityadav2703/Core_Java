package test;

import java.util.ArrayList;

public class MultiplyTwoArrayInReverse {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {1,2,3,4,5,6,7,8,9};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=a[i];
			int l=0;
			for(int j=b.length-1;j>=0;j--) {
				 l=b[j];	
			}
			al.add(k*l);
		}
		for(int ab : al) {
			System.out.print(ab+" ");
		}
	}

}
