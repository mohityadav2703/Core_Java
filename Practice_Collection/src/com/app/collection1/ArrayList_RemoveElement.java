//Write a Java program to insert an element into the array list at the first position.

package com.app.collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_RemoveElement {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		System.out.print("Original List is :");
		for(int ab : list) {
			System.out.print(ab+" ");
		}
		System.out.print("\nAfter Removing First Element :");
		list.remove(0);
		for(int ab :list) {
			System.out.print(ab+" ");
		}
		
	}
}
