// Write a Java program to extract a portion of an array list.

package com.app.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayList_ExtractPortion {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("India");
		list.add("Russia");
		list.add("Isarail");
		list.add("France");
		list.add("UAE");
		
		System.out.print("Original List :");
		for(String s : list) {
			System.out.print(s+" ");
		}
		Collections.swap(list, 1, 2);
		System.out.print("\nAfter Swap The Position :");
		for(String s :list) {
			System.out.print(s+" ");
		}
		
		System.out.println("\nPortion Of List :"+list.subList(0, 3));
	}
}
