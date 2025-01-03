// Write a Java program that swaps two elements in an array list.

package com.app.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_SwapTwoElements {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Russia");
		list.add("Isarail");
		list.add("France");
		list.add("UAE");
		
		System.out.print("Original List :");
		for(String s :list) {
			System.out.print(s+" ");
		}
		Collections.swap(list, 3, 4);
		System.out.print("\nAfter Swap :");
		for(String s : list) {
			System.out.print(s+" ");
		}
	}
}
