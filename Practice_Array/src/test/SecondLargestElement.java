package test;

import java.util.HashSet;
import java.util.Set;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9, 9};
		
		Set<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		
		System.out.println("After Removing Duplicate Elements :"+hs);
		System.out.println("Second Largest Elements :"+(hs.size()-1));
	}
}
