//Write a Java program to append the specified element to the end of a linked list.

package com.app.collection1;

import java.util.LinkedList;

public class LinkedList_AppendElementAtLast {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		list.addLast(20);
		System.out.println("After Adding New List :"+list);
	
	}

}
