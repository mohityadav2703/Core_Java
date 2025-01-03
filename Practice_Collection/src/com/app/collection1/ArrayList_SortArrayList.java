// Write a Java program to sort a given array list.


package com.app.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_SortArrayList {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(15);
		li.add(9);
		li.add(1);
		li.add(11);
		li.add(13);
		li.add(6);
		
		System.out.print("Original List :");
		for(int ab :li) {
			System.out.print(ab+" ");
		}
		
		System.out.print("\nSorted List In Ascending Order :");
		Collections.sort(li);
		for(int ab : li) {
			System.out.print(ab+" ");
		}
		
		System.out.print("\nSorted List In Descending Order :");
		Collections.reverse(li);
		for(int ab :li) {
			System.out.print(ab+" ");
		}
		
		System.out.println("\nMinimum Element of List :"+Collections.min(li));
		System.out.println("Maximum Element of List :"+Collections.max(li));
	
	}
}
