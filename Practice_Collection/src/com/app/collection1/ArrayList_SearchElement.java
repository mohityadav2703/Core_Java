// Write a Java program to search for an element in an array list.

package com.app.collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_SearchElement {
   public static void main(String[] args) {
	int srch=14;
	
	List<Integer> li=new ArrayList<Integer>();
	for(int i=10;i<=20;i++) {
		li.add(i);
	}
	System.out.print("Original List :");
	for(int ab :li) {
		System.out.print(ab+" ");
	}
	
	System.out.println("\nIs Element Present :"+li.contains(srch));
 }
}
