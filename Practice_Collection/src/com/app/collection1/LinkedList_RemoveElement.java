//Write a Java program to remove a specified element from a linked list.

package com.app.collection1;
import java.util.LinkedList;

public class LinkedList_RemoveElement {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=23;i<=33;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		list.remove(3);
		System.out.println("After Remove :"+list);
	}
}
