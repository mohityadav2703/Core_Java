//Write a Java program to iterate a linked list in reverse order.

package com.app.collection1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_IterateInReverse {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(9);
		list.add(13);
		list.add(17);
		list.add(19);
		list.add(12);
		list.add(2);
		
		System.out.print("Original List :"+list+" ");
		Collections.reverse(list);
		System.out.println("\nReverse List :"+list);
		
	}

}
