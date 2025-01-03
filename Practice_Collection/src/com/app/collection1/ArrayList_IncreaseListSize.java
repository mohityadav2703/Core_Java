// Write a Java program to increase an array list size.

package com.app.collection1;

import java.util.ArrayList;

public class ArrayList_IncreaseListSize {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		list.add(15);
		list.add(3);
		list.add(91);
		System.out.println("Original List :"+list);
		
		list.ensureCapacity(6);
		list.add(19);
		list.add(1);
		list.add(13);
		System.out.println("New List :"+list);
	}
}
