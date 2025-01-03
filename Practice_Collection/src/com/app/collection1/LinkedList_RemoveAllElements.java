//Write a Java program to remove all elements from a linked list.

package com.app.collection1;

import java.util.LinkedList;

public class LinkedList_RemoveAllElements {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=10;i<=20;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		list.removeAll(list);
		System.out.println("After Remove Elements :"+list);
	}
}
