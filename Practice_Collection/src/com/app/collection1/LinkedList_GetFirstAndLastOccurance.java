//Write a Java program to get the first and last occurrence of the specified elements in a linked list

package com.app.collection1;

import java.util.LinkedList;

public class LinkedList_GetFirstAndLastOccurance {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=10;i<=20;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		System.out.println("First Occurance :"+list.getFirst());
		System.out.println("Last Occurance :"+list.getLast());
	}
}