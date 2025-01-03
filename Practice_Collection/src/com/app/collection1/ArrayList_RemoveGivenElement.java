// Write a Java program to remove the third element from an array list.

package com.app.collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_RemoveGivenElement {
 
	public static void main(String[] args) {
		int ind=2;
		
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.print("Original List :");
		for(int ab : list) {
			System.out.print(ab+" ");
		}
		
		list.remove(ind);
		System.out.print("\nAfter Remove Element :");
		for(int ab :list) {
			System.out.print(ab+" ");
		}
	}
}
